package com.shdy.requestmodel;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by xuxiya on 2018/10/18
 */
public class ShowRequestprintAndTransByTrace {

    @ApiModelProperty(value = "HTTPS服务地址", name = "URL", required = true, example = "192.168.31.111:50087")
    @JSONField(name = "URL")
    private String url;

    @ApiModelProperty(value = "接口协议版本", name = "ProtocolVersion", required = true, example = "201701")
    @JSONField(name = "ProtocolVersion",ordinal = 1)
    private String protocolVersion;

    @ApiModelProperty(value = "第三方交易流水", name = "TrxID", required = true)
    @JSONField(name = "TrxID",ordinal = 2)
    private String trxID;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getProtocolVersion() {
        return protocolVersion;
    }

    public void setProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
    }

    public String getTrxID() {
        return trxID;
    }

    public void setTrxID(String trxID) {
        this.trxID = trxID;
    }
}
