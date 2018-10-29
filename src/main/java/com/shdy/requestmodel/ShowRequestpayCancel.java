package com.shdy.requestmodel;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by xuxiya on 2018/10/17
 */
public class ShowRequestpayCancel {

    @ApiModelProperty(value = "HTTPS服务地址", name = "URL", required = true, example = "192.168.31.111:50087")
    @JSONField(name = "URL")
    private String url;

    @ApiModelProperty(value = "第三方交易流水", name = "TrxID", required = true)
    @JSONField(name = "TrxID")
    private String trxID;

    @ApiModelProperty(value = "支付类型", name = "PayType")
    @JSONField(name = "PayType")
    private String payType;

    @ApiModelProperty(value = "商户撤销单号", name = "mer_refund_order_no", required = true)
    private String mer_refund_order_no;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTrxID() {
        return trxID;
    }

    public void setTrxID(String trxID) {
        this.trxID = trxID;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getMer_refund_order_no() {
        return mer_refund_order_no;
    }

    public void setMer_refund_order_no(String mer_refund_order_no) {
        this.mer_refund_order_no = mer_refund_order_no;
    }
}
