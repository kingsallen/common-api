/*
 * This file is generated by jOOQ.
*/
package com.moseeker.vo.company.basic;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.sql.Timestamp;


/**
 * 微信公众号表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "wxWechat", description = "微信公众号信息")
public class HrWxWechatVO {

    private static final long serialVersionUID = -1567730135;

    @ApiModelProperty(value = "公众号编号")
    private Integer   id;
    private Integer   companyId;
    @ApiModelProperty(value = "公众号类型, 0:订阅号, 1:服务号", dataType="java.lang.Integer")
    private Byte      type;
    private String    signature;
    private String    name;
    @ApiModelProperty(value = "别名")
    private String    alias;
    @ApiModelProperty(value = "用户名")
    private String    username;
    @ApiModelProperty(value = "密码")
    private String    password;
    @ApiModelProperty(value = "开发者token")
    private String    token;
    @ApiModelProperty(value = "开发者appid")
    private String    appid;
    @ApiModelProperty(value = "开发者secret")
    private String    secret;
    @ApiModelProperty(value = "welcome message")
    private Integer   welcome;
    @ApiModelProperty(value = "default message")
    private Integer  defaultMessage;
    @ApiModelProperty(value = "关注公众号的二维码")
    private String    qrcode;
    @ApiModelProperty(value = "被动求职者开关，0= 开启, 1=不开启", dataType="java.lang.Integer")
    private Byte      passiveSeeker;
    @ApiModelProperty(value = "授权大岂第三方平台0：未授权 1：授权了", dataType="java.lang.Integer")
    private Byte      thirdOauth;
    @ApiModelProperty(value = "是否启用免费雇主注册，0：不启用，1：启用", dataType="java.lang.Integer")
    private Byte      hrRegister;
    @ApiModelProperty(value = "access_token最新更新时间")
    private Integer   accessTokenCreateTime;
    @ApiModelProperty(value = "access_token过期时间")
    private Integer   accessTokenExpired;
    @ApiModelProperty(value = "access_token")
    private String    accessToken;
    private String    jsapiTicket;
    @ApiModelProperty(value = "是否授权0：无关，1：授权2：解除授权", dataType="java.lang.Integer")
    private Byte      authorized;
    @ApiModelProperty(value = "解除授权的时间戳")
    private Integer   unauthorizedTime;
    @ApiModelProperty(value = "第三方授权的刷新token，用来刷access_token")
    private String    authorizerRefreshToken;
    private Timestamp createTime;
    private Timestamp updateTime;
    @ApiModelProperty(value = "显示仟寻聚合号二维码, 0:不允许，1:允许")
    private Integer   showQxQrcode;
    @ApiModelProperty(value = " 用于表示是否可以开启企业自定义颜色配置 0是否 1是开启")
    private Integer   showCustomTheme;


}
