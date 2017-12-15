/*
 * Copyright (c) 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.javaer.wechat.sdk.pay;

import cn.javaer.wechat.sdk.pay.model.WeChatPayResponse;
import com.esotericsoftware.reflectasm.MethodAccess;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.annotation.XmlElement;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 微信支付工具类.
 *
 * @author zhangpeng
 */
public class WeChatPayUtils {

    private static final Logger log = LoggerFactory.getLogger(WeChatPayUtils.class);

    private static final Map<Class, Map<String, NameIndex>> CACHE_FOR_SIGN = new ConcurrentHashMap<>();

    /**
     * 微信支付-签名.
     *
     * @param obj 要签名的数据对象.
     * @param key key
     *
     * @return 返回签名 String
     */
    public static String sign(final Object obj, final String key) {

        final Class<?> clazz = obj.getClass();

        Map<String, NameIndex> cache = CACHE_FOR_SIGN.get(clazz);

        final MethodAccess methodAccess = MethodAccess.get(clazz);

        if (null != cache) {
            log.debug("Sign '{}' from cache", clazz.getName());

            final Map<String, String> sortedMap = new TreeMap<>();

            for (final Map.Entry<String, NameIndex> entry : cache.entrySet()) {
                final NameIndex nameIndex = entry.getValue();
                final Object value = methodAccess.invoke(obj, nameIndex.getMethodIndex());
                putNonNullValueAsString(sortedMap, entry.getKey(), value);
            }
            final StringBuilder sb = new StringBuilder();

            for (final Map.Entry<String, String> entry : sortedMap.entrySet()) {
                sb.append(entry.getKey()).append('=').append(entry.getValue()).append('&');
            }
            sb.append("key").append('=').append(key);
            return DigestUtils.md5Hex(sb.toString()).toUpperCase();
        } else {
            cache = new TreeMap<>();
            CACHE_FOR_SIGN.put(clazz, cache);
        }

        final String[] methodNames = methodAccess.getMethodNames();
        final Class[] returnTypes = methodAccess.getReturnTypes();
        final Class[][] parameterTypes = methodAccess.getParameterTypes();

        final List<Field> fields = FieldUtils.getFieldsListWithAnnotation(clazz, XmlElement.class);

        final Map<String, String> sortedMap = new TreeMap<>();

        for (int i = 0; i < methodNames.length; i++) {
            final String methodName = methodNames[i];

            final boolean readMethodNonParam = parameterTypes[i] == null || parameterTypes[i].length == 0;
            final boolean readWithBool = methodName.startsWith("is") && (
                    (returnTypes[i] == boolean.class) || (returnTypes[i] == Boolean.class));
            final boolean readMethod = methodName.startsWith("get") || readWithBool;
            final boolean notIgnoreMethod = !"getSign".equals(methodName) && !"getClass".equals(methodName);

            if (readMethod && readMethodNonParam && notIgnoreMethod) {
                final String k = keyFromXmlElementName(methodName, fields);
                final Object value = methodAccess.invoke(obj, i);
                putNonNullValueAsString(sortedMap, k, value);
                cache.put(k, new NameIndex(methodName, i));
            }
        }

        final StringBuilder sb = new StringBuilder();

        for (final Map.Entry<String, String> entry : sortedMap.entrySet()) {
            sb.append(entry.getKey()).append('=').append(entry.getValue()).append('&');
        }
        sb.append("key").append('=').append(key);
        return DigestUtils.md5Hex(sb.toString()).toUpperCase();
    }

    /**
     * 校验响应信息是否为成功.
     *
     * @param response WeChatPayResponse
     * @param mchKey 商户key
     *
     * @throws WeChatPayException 没有响应信息, 签名错误, 响应信息标示不成功时抛出此异常.
     */
    public static void checkResponseBody(final WeChatPayResponse response, @NotNull final String mchKey) {
        if (null == response) {
            throw new WeChatPayException("WeChat pay response is null");
        }
        if (!response.getSign().equals(WeChatPayUtils.sign(response, mchKey))) {
            throw new WeChatPayException("WeChat pay response 'sign' error, response:" + response.toString());
        }
        if (!WeChatPayResponse.SUCCESS.equals(response.getReturnCode())) {
            throw new WeChatPayException("WeChat pay response error, response:" + response.toString());
        }
        if (!WeChatPayResponse.SUCCESS.equals(response.getResultCode())) {
            throw new WeChatPayException("WeChat pay response error, response:" + response.toString());
        }
    }

    /**
     * 判断响应信息是否为成功.
     *
     * @param response WeChatPayResponse
     *
     * @return 有响应信息, 并且完全成功返回 true
     */
    public static boolean isSuccessfulResponseBody(final WeChatPayResponse response) {

        return (null != response)
                && (WeChatPayResponse.SUCCESS.equals(response.getReturnCode()))
                && (WeChatPayResponse.SUCCESS.equals(response.getResultCode()));
    }

    static String beanMethodNameToFieldName(final String methodName) {

        if (methodName.startsWith("get")) {
            final char[] chars = methodName.toCharArray();
            if (chars[3] >= 'A' && chars[3] <= 'Z') {
                chars[3] += 32;
            }
            return String.copyValueOf(chars, 3, chars.length - 3);
        }

        throw new IllegalArgumentException("'methodName' must be a read method of javabean");
    }

    private static void putNonNullValueAsString(
            final Map<String, String> sortedMap, final String key, final Object value) {
        if (null != value) {
            final String valStr = value.toString();
            if (!valStr.isEmpty()) {
                sortedMap.put(key, valStr);
            }
        }
    }

    private static String keyFromXmlElementName(final String methodName, final List<Field> fields) {
        for (final Field field : fields) {
            if (field.getName().equals(beanMethodNameToFieldName(methodName))) {
                final XmlElement[] xmlElements = field.getAnnotationsByType(XmlElement.class);
                if (null != xmlElements && xmlElements.length > 0) {
                    final String xmlElementName = xmlElements[0].name();
                    if (StringUtils.isNotEmpty(xmlElementName)) {
                        return xmlElementName;
                    }
                }
            }
        }
        return methodName;
    }

    private static class NameIndex {
        private final String methodName;
        private final int methodIndex;

        public NameIndex(final String methodName, final int methodIndex) {
            this.methodName = methodName;
            this.methodIndex = methodIndex;
        }

        public String getMethodName() {
            return this.methodName;
        }

        public int getMethodIndex() {
            return this.methodIndex;
        }
    }
}
