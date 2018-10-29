package com.shdy.utils;

import org.apache.commons.lang.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by xuxiya on 2018/10/17
 */
public abstract class WebUtil {


    private static ThreadLocal<String> ipThreadLocal = new ThreadLocal<>();

    //private
    private WebUtil() {
    }


    public static void setIp(String ip) {
        ipThreadLocal.set(ip);
    }

    public static String getIp() {
        return ipThreadLocal.get();
    }


    /**
     * Retrieve client ip address
     *
     * @param request HttpServletRequest
     * @return IP
     */
    public static String retrieveClientIp(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (isUnAvailableIp(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (isUnAvailableIp(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (isUnAvailableIp(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

    private static boolean isUnAvailableIp(String ip) {
        return StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip);
    }

}