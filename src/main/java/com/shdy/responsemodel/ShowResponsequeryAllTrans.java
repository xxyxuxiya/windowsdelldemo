package com.shdy.responsemodel;

/**
 * Created by xuxiya on 2018/10/18
 */
public class ShowResponsequeryAllTrans {

    private String URL;
    private String RespCode;
    private String RespDesc;
    private String TransList;
    private String Transtype;
    private String TransDate;
    private String TransTime;
    private String TransAmount;
    private String mer_order_no;
    private String mer_refund_order_no;
    private String PayType;
    private String pay_no;

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getRespCode() {
        return RespCode;
    }

    public void setRespCode(String respCode) {
        RespCode = respCode;
    }

    public String getRespDesc() {
        return RespDesc;
    }

    public void setRespDesc(String respDesc) {
        RespDesc = respDesc;
    }

    public String getTransList() {
        return TransList;
    }

    public void setTransList(String transList) {
        TransList = transList;
    }

    public String getTranstype() {
        return Transtype;
    }

    public void setTranstype(String transtype) {
        Transtype = transtype;
    }

    public String getTransDate() {
        return TransDate;
    }

    public void setTransDate(String transDate) {
        TransDate = transDate;
    }

    public String getTransTime() {
        return TransTime;
    }

    public void setTransTime(String transTime) {
        TransTime = transTime;
    }

    public String getTransAmount() {
        return TransAmount;
    }

    public void setTransAmount(String transAmount) {
        TransAmount = transAmount;
    }

    public String getMer_order_no() {
        return mer_order_no;
    }

    public void setMer_order_no(String mer_order_no) {
        this.mer_order_no = mer_order_no;
    }

    public String getMer_refund_order_no() {
        return mer_refund_order_no;
    }

    public void setMer_refund_order_no(String mer_refund_order_no) {
        this.mer_refund_order_no = mer_refund_order_no;
    }

    public String getPayType() {
        return PayType;
    }

    public void setPayType(String payType) {
        PayType = payType;
    }

    public String getPay_no() {
        return pay_no;
    }

    public void setPay_no(String pay_no) {
        this.pay_no = pay_no;
    }
}
