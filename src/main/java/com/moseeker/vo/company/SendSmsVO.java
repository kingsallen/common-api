package com.moseeker.vo.company;


import com.moseeker.util.SmsType;
import java.util.Map;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/5/16.
 */
@Data
@EqualsAndHashCode(callSuper = false)
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

    public SendSmsVO(){

    }
}
