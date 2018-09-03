package com.moseeker.vo.company;


import com.moseeker.util.SmsType;
import java.util.Map;

/**
 * Created by moseeker on 2018/5/16.
 */
public class SendSmsVO {
    private SmsType smsType;
    private String mobile;
    private Map<String, String> params;
    private String sys;
    private String ip;

    public SendSmsVO(SmsType smsType, String mobile, Map<String, String> params, String sys, String ip) {
        this.smsType = smsType;
        this.mobile = mobile;
        this.params = params;
        this.sys = sys;
        this.ip = ip;
    }

    public SmsType getSmsType() {
        return smsType;
    }

    public String getMobile() {
        return mobile;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public String getSys() {
        return sys;
    }

    public String getIp() {
        return ip;
    }
}
