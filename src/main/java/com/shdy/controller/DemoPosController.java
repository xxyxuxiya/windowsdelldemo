package com.shdy.controller;

import com.alibaba.fastjson.JSON;
import com.shdy.interfaces.DevPOS;
import com.shdy.requestmodel.*;
import com.shdy.responsemodel.*;
import com.shdy.utils.FileUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

/**
 * Created by xuxiya on 2018/10/17
 */
@Controller
@RequestMapping("/DemoPosController")
@Api(tags = {"DemoPosController"}, description = "windowsDLL调取演示")
public class DemoPosController {

    @ResponseBody
    @RequestMapping(value = "/getPOSInfoDemo", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ApiOperation(value = "获取POS信息", httpMethod = "POST", response = String.class)
    public String getPOSInfoDemo(@RequestBody ShowRequestgetPOSInfo Request) throws IOException {

        String requestJSON = JSON.toJSONString(Request);
        String response = requestJSON.replace("\"","\\\"");
        response = "\""+response+"\"";
        return response;
    }

    @ResponseBody
    @RequestMapping(value = "/logindemo", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ApiOperation(value = "签到", httpMethod = "POST", response = String.class)
    public String logindemo(@RequestBody ShowRequestlogin Request) throws IOException{

        String requestJSON = JSON.toJSONString(Request);
        String response = requestJSON.replace("\"","\\\"");
        response = "\""+response+"\"";
        return response;
    }

    @ResponseBody
    @RequestMapping(value = "/payCashDemo", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ApiOperation(value = "消费", httpMethod = "POST", response = String.class)
    public String payCashDemo(@RequestBody ShowResponsepayCash Request) {

        String requestJSON = JSON.toJSONString(Request);
        String response = requestJSON.replace("\"","\\\"");
        response = "\""+response+"\"";
        return response;
    }

    @ResponseBody
    @RequestMapping(value = "/payCancelDemo", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ApiOperation(value = "消费撤销", httpMethod = "POST", response = ShowResponsepayCancel.class)
    public String payCancelDemo(@RequestBody ShowRequestpayCancel Request) {

        String requestJSON = JSON.toJSONString(Request);
        String response = requestJSON.replace("\"","\\\"");
        response = "\""+response+"\"";
        return response;
    }


    @ResponseBody
    @RequestMapping(value = "/printAndTransByTraceDemo", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ApiOperation(value = "获取单笔交易信息", httpMethod = "POST", response = String.class)
    public String printAndTransByTraceDemo(@RequestBody ShowRequestprintAndTransByTrace Request) {

        String requestJSON = JSON.toJSONString(Request);
        String response = requestJSON.replace("\"","\\\"");
        response = "\""+response+"\"";
        return response;
    }

    @ResponseBody
    @RequestMapping(value = "/queryAllTransDemo", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ApiOperation(value = "获取当批所有交易信息", httpMethod = "POST", response = String.class)
    public String queryAllTransDemo(@RequestBody ShowRequestqueryAllTrans Request) {

        String requestJSON = JSON.toJSONString(Request);
        String response = requestJSON.replace("\"","\\\"");
        response = "\""+response+"\"";
        return response;
    }

    @ResponseBody
    @RequestMapping(value = "/refundDemo", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ApiOperation(value = "退货", httpMethod = "POST", response = String.class)
    public String refundDemo(@RequestBody ShowRequestgetPOSInfo Request) {

        String requestJSON = JSON.toJSONString(Request);
        String response = requestJSON.replace("\"","\\\"");
        response = "\""+response+"\"";
        return response;
    }

    @ResponseBody
    @RequestMapping(value = "/settleDemo", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ApiOperation(value = "结算", httpMethod = "POST", response = String.class)
    public String settleDemo(@RequestBody ShowRequestsettle Request) {

        String requestJSON = JSON.toJSONString(Request);
        String response = requestJSON.replace("\"","\\\"");
        response = "\""+response+"\"";
        return response;
    }


}
