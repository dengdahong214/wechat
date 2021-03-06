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

import cn.javaer.wechat.sdk.pay.model.CloseOrderRequest;
import cn.javaer.wechat.sdk.pay.model.CloseOrderResponse;
import cn.javaer.wechat.sdk.pay.model.OrderQueryRequest;
import cn.javaer.wechat.sdk.pay.model.OrderQueryResponse;
import cn.javaer.wechat.sdk.pay.model.RefundQueryRequest;
import cn.javaer.wechat.sdk.pay.model.RefundQueryResponse;
import cn.javaer.wechat.sdk.pay.model.RefundRequest;
import cn.javaer.wechat.sdk.pay.model.RefundResponse;
import cn.javaer.wechat.sdk.pay.model.UnifiedOrderRequest;
import cn.javaer.wechat.sdk.pay.model.UnifiedOrderResponse;

/**
 * 微信支付客户端接口.
 *
 * @author zhangpeng
 */
public interface WeChatPayClient {

    /**
     * 微信支付系统 base path.
     */
    String BASE_PATH = "https://api.mch.weixin.qq.com";

    /**
     * 统一下单 path.
     */
    String UNIFIED_ORDER_PATH = "/pay/unifiedorder";

    /**
     * 查询订单 path.
     */
    String ORDER_QUERY_PATH = "/pay/orderquery";

    /**
     * 关闭订单 path.
     */
    String CLOSE_ORDER_PATH = "/pay/closeorder";

    /**
     * 申请退款 path.
     */
    String REFUND_PATH = "/secapi/pay/refund";

    /**
     * 查询退款 path.
     */
    String REFUND_QUERY_PATH = "/pay/refundquery";

    /**
     * 下载对账单 path.
     */
    String DOWNLOAD_BILL_PATH = "/pay/downloadbill";

    /**
     * 交易保障 path.
     */
    String REPORT_PATH = "/payitil/report";

    /**
     * 拉取订单评价数据 path.
     */
    String BATCH_QUERY_COMMENT_PATH = "/billcommentsp/batchquerycomment";

    /**
     * 统一下单.
     *
     * @param request UnifiedOrderRequest
     *
     * @return UnifiedOrderResponse
     *
     * @throws WeChatPayException WeChatPayException
     */
    UnifiedOrderResponse unifiedOrder(UnifiedOrderRequest request) throws WeChatPayException;

    /**
     * 查询订单.
     *
     * @param request OrderQueryRequest
     *
     * @return OrderQueryResponse
     *
     * @throws WeChatPayException WeChatPayException
     */
    OrderQueryResponse orderQuery(OrderQueryRequest request) throws WeChatPayException;

    /**
     * 关闭订单.
     *
     * @param request CloseOrderRequest
     *
     * @return CloseOrderResponse
     *
     * @throws WeChatPayException WeChatPayException
     */
    CloseOrderResponse closeOrder(CloseOrderRequest request) throws WeChatPayException;

    /**
     * 申请退款.
     *
     * @param request RefundRequest
     *
     * @return RefundResponse
     *
     * @throws WeChatPayException WeChatPayException
     */
    RefundResponse refund(RefundRequest request) throws WeChatPayException;

    /**
     * 查询退款.
     *
     * @param request RefundQueryRequest
     *
     * @return RefundQueryResponse
     *
     * @throws WeChatPayException WeChatPayException
     */
    RefundQueryResponse refundQuery(RefundQueryRequest request) throws WeChatPayException;
}