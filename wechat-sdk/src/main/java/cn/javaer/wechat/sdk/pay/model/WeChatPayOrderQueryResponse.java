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

import cn.javaer.wechat.sdk.pay.SignIgnore;
import cn.javaer.wechat.sdk.pay.WeChatPayUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * 微信支付-查询订单-响应.
 *
 * @author zhangpeng
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "xml")
public class WeChatPayOrderQueryResponse extends WeChatPayResponse {

    @XmlElement(name = "openid")
    private String openid;

    @XmlElement(name = "is_subscribe")
    private String isSubscribe;

    @XmlElement(name = "sub_openid")
    private String subOpenid;

    @XmlElement(name = "sub_is_subscribe")
    private String subIsSubscribe;

    @XmlElement(name = "trade_type")
    private String tradeType;

    @XmlElement(name = "trade_state")
    private String tradeState;

    @XmlElement(name = "bank_type")
    private String bankType;

    @XmlElement(name = "detail")
    private String detail;

    @XmlElement(name = "total_fee")
    private Integer totalFee;

    @XmlElement(name = "fee_type")
    private String feeType;

    @XmlElement(name = "settlement_total_fee")
    private Integer settlementTotalFee;

    @XmlElement(name = "cash_fee")
    private Integer cashFee;

    @XmlElement(name = "cash_fee_type")
    private String cashFeeType;

    @XmlElement(name = "coupon_fee")
    private Integer couponFee;

    @XmlElement(name = "coupon_count")
    private Integer couponCount;

    @XmlElement(name = "transaction_id")
    private String transactionId;

    @XmlElement(name = "out_trade_no")
    private String outTradeNo;

    @XmlElement(name = "device_info")
    private String deviceInfo;

    @XmlElement(name = "attach")
    private String attach;

    @XmlElement(name = "time_end")
    private String timeEnd;

    @XmlElement(name = "trade_state_desc")
    private String tradeStateDesc;

    /**
     * 代金券.
     */
    @SignIgnore
    private Map<String, WeChatPayCoupon> coupons;

    @Override
    public void beforeSign() {
        super.beforeSign();
        if (null == this.coupons && null != this.otherMap) {
            final Map<String, BiConsumer<String, WeChatPayCoupon>> mappingMap = new HashMap<>(3);
            mappingMap.put("coupon_id_", (val, coupon) -> coupon.setId(val));
            mappingMap.put("coupon_type_", (val, coupon) -> coupon.setType(WeChatPayCoupon.Type.valueOf(val)));
            mappingMap.put("coupon_fee_", (val, coupon) -> coupon.setFee(Integer.valueOf(val)));

            this.coupons = WeChatPayUtils.dynamicMapping(
                    this.otherMap, Collections.unmodifiableMap(mappingMap), WeChatPayCoupon::new);
        }
    }
}