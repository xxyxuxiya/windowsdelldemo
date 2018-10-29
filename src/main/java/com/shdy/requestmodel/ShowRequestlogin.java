package com.shdy.requestmodel;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by xuxiya on 2018/10/17
 */
public class ShowRequestlogin {
    @ApiModelProperty(value = "HTTPS服务地址", name = "URL", required = true, example = "192.168.31.111:50087")
    @JSONField(name = "URL",ordinal = 0)
    private String url;

    @ApiModelProperty(value = "接口协议版本", name = "ProtocolVersion", required = true, example = "201701")
    @JSONField(name = "ProtocolVersion",ordinal = 1)
    private String protocolVersion;

    @ApiModelProperty(value = "操作员号", name = "OptCode", required = true, example = "01")
    @JSONField(name = "OptCode",ordinal = 2)
    private String optCode;

    @ApiModelProperty(value = "操作员登陆密码", name = "OptPass", required = true, example = "123456")
    @JSONField(name = "OptPass",ordinal = 3)
    private String optPass;

    @ApiModelProperty(value = "机具编号", name = "termidm", required = true, example = "LD1809CA886769")
    @JSONField(ordinal = 4)
    private String termidm;

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

    public String getOptCode() {
        return optCode;
    }

    public void setOptCode(String optCode) {
        this.optCode = optCode;
    }

    public String getOptPass() {
        return optPass;
    }

    public void setOptPass(String optPass) {
        this.optPass = optPass;
    }

    public String getTermidm() {
        return termidm;
    }

    public void setTermidm(String termidm) {
        this.termidm = termidm;
    }
}
