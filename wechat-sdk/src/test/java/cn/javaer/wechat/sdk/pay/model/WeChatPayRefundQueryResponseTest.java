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

package cn.javaer.wechat.sdk.pay.model;

import cn.javaer.wechat.sdk.pay.WeChatPayConfigurator;
import cn.javaer.wechat.test.WeChatTestUtils;
import org.junit.Test;

/**
 * @author zhangpeng
 */
public class WeChatPayRefundQueryResponseTest {

    @Test
    public void beforeSign() {
        final String xmlStr = WeChatTestUtils.readClassPathFileToUTFString("/WeChatPayRefundQueryResponse.xml", this.getClass());
        final WeChatPayRefundQueryResponse response = WeChatTestUtils.jaxbUnmarshal(xmlStr, WeChatPayRefundQueryResponse.class);
        WeChatPayConfigurator.INSTANCE.setMchKey("key");
        response.checkSignAndSuccessful();
    }
}