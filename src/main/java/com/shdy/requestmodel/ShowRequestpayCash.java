package com.shdy.requestmodel;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by xuxiya on 2018/10/17
 */
public class ShowRequestpayCash {

    @ApiModelProperty(value = "HTTPS服务地址", name = "URL", required = true, example = "192.168.31.111:50087")
    @JSONField(name = "URL")
    private String url;

    @ApiModelProperty(value = "第三方交易流水号", name = "TrxID", required = true)
    @JSONField(name = "TrxID")
    private String trxID;

    @ApiModelProperty(value = "HTTPS服务地址", name = "ProtocolVersion", required = true, example = "201701")
    @JSONField(name = "ProtocolVersion")
    private String protocolVersion;

    @ApiModelProperty(value = "支付类型", name = "URL",required = true, example = "")
    @JSONField(name = "PayType")
    private String payType;

    @ApiModelProperty(value = "订单总金额(分)", name = "TransAmount", required = true, example = "1")
    @JSONField(name = "TransAmount")
    private String transAmount;

    @ApiModelProperty(value = "机具编号", name = "termidm", required = true, example = "LD1809CA886769")
    private String termidm;

    @ApiModelProperty(value = "外部订单号", name = "out_order_no",required = true, example = "")
    private String out_order_no;

    @ApiModelProperty(value = "付款码", name = "bar_code",required = true, example = "")
    private String bar_code;

    @ApiModelProperty(value = "订单名称", name = "order_name", required = true, example = "测试订单")
    private String order_name;

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

    public String getProtocolVersion() {
        return protocolVersion;
    }

    public void setProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(String transAmount) {
        this.transAmount = transAmount;
    }

    public String getTermidm() {
        return termidm;
    }

    public void setTermidm(String termidm) {
        this.termidm = termidm;
    }

    public String getOut_order_no() {
        return out_order_no;
    }

    public void setOut_order_no(String out_order_no) {
        this.out_order_no = out_order_no;
    }

    public String getBar_code() {
        return bar_code;
    }

    public void setBar_code(String bar_code) {
        this.bar_code = bar_code;
    }

    public String getOrder_name() {
        return order_name;
    }

    public void setOrder_name(String order_name) {
        this.order_name = order_name;
    }
}
