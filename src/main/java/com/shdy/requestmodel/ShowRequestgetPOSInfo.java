package com.shdy.requestmodel;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by xuxiya on 2018/10/17
 */
public class ShowRequestgetPOSInfo {


    @ApiModelProperty(value = "HTTPS服务地址", name = "URL", required = true, example = "192.168.31.111:50087")
    @JSONField(name = "URL")
    private String url;

    @ApiModelProperty(value = "接口协议版本", name = "ProtocolVersion", required = true, example = "201701")
    @JSONField(name = "ProtocolVersion")
    private String protocolVersion;

    @ApiModelProperty(value = "请求交易日期", name = "ReqTransDate", required = true)
    @JSONField(name = "ReqTransDate")
    private String reqTransDate;

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

    public String getReqTransDate() {
        return reqTransDate;
    }

    public void setReqTransDate(String reqTransDate) {
        this.reqTransDate = reqTransDate;
    }
}
