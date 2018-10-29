package com.shdy.responsemodel;

/**
 * Created by xuxiya on 2018/10/17
 */
public class ShowResponsegetPOSInfo {

    private String MerchantName;
    private String MerchantID;
    private String TerminalID;
    private String OperatorID;
    private String RespCode;
    private String RespDesc;
    private String SignOn;

    public String getMerchantName() {
        return MerchantName;
    }

    public void setMerchantName(String merchantName) {
        MerchantName = merchantName;
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

    public String getOperatorID() {
        return OperatorID;
    }

    public void setOperatorID(String operatorID) {
        OperatorID = operatorID;
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

    public String getSignOn() {
        return SignOn;
    }

    public void setSignOn(String signOn) {
        SignOn = signOn;
    }
}
