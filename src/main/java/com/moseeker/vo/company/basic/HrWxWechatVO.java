package com.moseeker.vo.company.basic;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @Date: 2018/11/12
 * @Author: JackYang
 */
@Data
public class HrWxWechatVO implements Serializable {
    private static final long serialVersionUID = 6772297435637600378L;

    private Integer   id;
    private Integer   companyId;
    private Byte      type;
    private String    signature;
    private String    name;
    private String    alias;
    private String    username;
    private String    password;
    private String    token;
    private String    appid;
    private String    secret;
    private Integer   welcome;
    private Integer   default_;
    private String    qrcode;
    private Byte      passiveSeeker;
    private Byte      thirdOauth;
    private Byte      hrRegister;
    private Integer   accessTokenCreateTime;
    private Integer   accessTokenExpired;
    private String    accessToken;
    private String    jsapiTicket;
    private Byte      authorized;
    private Integer   unauthorizedTime;
    private String    authorizerRefreshToken;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Integer   showQxQrcode;
    private Integer   showCustomTheme;
}
