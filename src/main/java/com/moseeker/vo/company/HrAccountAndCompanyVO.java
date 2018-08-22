package com.moseeker.vo.company;

import java.sql.Timestamp;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/5/15.
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class HrAccountAndCompanyVO {
    private String code;
    private Integer   id;
    private Integer   companyId;
    private String    mobile;
    private String    email;
    private Integer   wxuserId;
    private String    password;
    private String    username;
    private Integer   accountType;
    private Byte      activation;
    private Timestamp registerTime;
    private String    registerIp;
    private Timestamp lastLoginTime;
    private String    lastLoginIp;
    private Integer   loginCount;
    private Integer   source;
    private String    downloadToken;
    private String    headimgurl;
    private Byte      leaveToMobot;
    private Byte   companySource;
    private String    name;
    private Byte      type;
    private String    introduction;
    private Byte      scale;
    private String    address;
    private Byte      property;
    private String    industry;
    private String    homepage;
    private String    logo;
    private String    abbreviation;
    private String    impression;
    private String    banner;
    private Integer   parentId;
    private Integer   hraccountId;
    private String    slogan;
    private String    feature;
    private Byte      fortune;

}
