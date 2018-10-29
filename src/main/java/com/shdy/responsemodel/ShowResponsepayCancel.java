package com.shdy.responsemodel;

/**
 * Created by xuxiya on 2018/10/17
 */
public class ShowResponsepayCancel {
    private String URL;
    private String TrxID;
    private String PayType;
    private String TransDate;
    private String TransTime;
    private String RespCode;
    private String RespDesc;
    private String OptCode;
    private String BatchNum;
    private String MerchantID;
    private String TerminalID;
    private String MerchantName;

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getTrxID() {
        return TrxID;
    }

    public void setTrxID(String trxID) {
        TrxID = trxID;
    }

    public String getPayType() {
        return PayType;
    }

    public void setPayType(String payType) {
        PayType = payType;
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

    public String getOptCode() {
        return OptCode;
    }

    public void setOptCode(String optCode) {
        OptCode = optCode;
    }

    public String getBatchNum() {
        return BatchNum;
    }

    public void setBatchNum(String batchNum) {
        BatchNum = batchNum;
    }

    public String getMerchantID() {
        return MerchantID;
    }

    public void setMerchantID(String merchantID) {
        MerchantID = merchantID;
    }

    public String getTerminalID() {
        return TerminalID;
    }

    public void setTerminalID(String terminalID) {
        TerminalID = terminalID;
    }

    public String getMerchantName() {
        return MerchantName;
    }

    public void setMerchantName(String merchantName) {
        MerchantName = merchantName;
    }
}
