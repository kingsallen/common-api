/*
 * This file is generated by jOOQ.
*/
package com.moseeker.vo.company.basic;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.sql.Timestamp;


/**
 * hr账号表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(description = "Hr信息")
public class UserHrAccountVO {

    private static final long serialVersionUID = -128443835;

    private Integer   id;
    private Integer   companyId;
    private String    mobile;
    private String    email;
    @ApiModelProperty(value = "绑定的微信账号")
    private Integer   wxuserId;
    private String    password;
    private String    username;
    @ApiModelProperty(value = "0 超级账号；1：子账号; 2：普通账号")
    private Integer   accountType;
    @ApiModelProperty(value = "子账号邀请使用，账号是否激活，1：激活；0：未激活")
    private Byte      activation;
    @ApiModelProperty(value = "1表示可用，0表示不可用")
    private Integer   disable;
    @ApiModelProperty(value = "注册时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp registerTime;
    @ApiModelProperty(value = "注册IP")
    private String    registerIp;
    @ApiModelProperty(value = "最后的登录时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp lastLoginTime;
    @ApiModelProperty(value = "最后一次登录的IP")
    private String    lastLoginIp;
    private Integer   loginCount;
    @ApiModelProperty(value = "来源1:雇主 2:官网 3:微信扫描 4:我也要招人(聚合号) 5:我也要招人(企业号) 6:我也要招人(手机官网)")
    private Integer   source;
    @ApiModelProperty(value = "下载行业报告校验码")
    private String    downloadToken;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;
    private String    headimgurl;
    @ApiModelProperty(value = "HR聊天是否托管给智能招聘助手，0 不托管，1 托管")
    private Integer   leaveToMobot;
    private String    remarkName;

}
