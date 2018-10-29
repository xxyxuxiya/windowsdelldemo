package com.shdy.requestmodel;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by xuxiya on 2018/10/18
 */
public class ShowRequestqueryAllTrans {
    @ApiModelProperty(value = "HTTPS服务地址", name = "URL", required = true, example = "192.168.31.111:50087")
    @JSONField(name = "URL")
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
