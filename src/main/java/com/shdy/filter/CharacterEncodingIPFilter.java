package com.shdy.filter;


import com.shdy.utils.WebUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by xuxiya on 2018/10/17
 */
public class CharacterEncodingIPFilter extends CharacterEncodingFilter {

    private static final Logger LOG = LoggerFactory.getLogger(CharacterEncodingIPFilter.class);


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        recordIP(request);
        super.doFilterInternal(request, response, filterChain);
    }

    private void recordIP(HttpServletRequest request) {
        final String ip = WebUtil.retrieveClientIp(request);
        WebUtil.setIp(ip);
        LOG.debug("Send request uri: {}, from IP: {}", request.getRequestURI(), ip);
    }
}
