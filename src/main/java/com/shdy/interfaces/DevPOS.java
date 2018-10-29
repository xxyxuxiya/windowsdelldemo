package com.shdy.interfaces;

import com.sun.jna.Native;
import com.sun.jna.WString;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.win32.StdCallLibrary;

/**
 * Created by xuxiya on 2018/10/17
 */
public interface DevPOS extends StdCallLibrary {

    DevPOS instance = (DevPOS) Native.loadLibrary("DevPOS", DevPOS.class);
    String login(String jsonData);
    String payCash(String jsonData);
    String payCancel(String jsonData);
    String getPOSInfo(String jsonData);
    String printAndTransByTrace(String jsonData);
    String queryAllTrans(String jsonData);
    String refund(String jsonData);
    String settle(String jsonData);
}
