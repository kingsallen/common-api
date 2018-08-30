/*
 * This file is generated by jOOQ.
*/
package com.moseeker.vo.company.basic;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.sql.Timestamp;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * 微信公众号表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "wxWechat", description = "微信公众号信息")
public class HrWxWechatVO  {

    private static final long serialVersionUID = -1567730135;

    @ApiModelProperty(value = "公众号编号")
    private Integer   id;
    private Integer   companyId;
    @ApiModelProperty(value = "公众号类型, 0:订阅号, 1:服务号")
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
    private Integer   default_;
    @ApiModelProperty(value = "关注公众号的二维码")
    private String    qrcode;
    @ApiModelProperty(value = "被动求职者开关，0= 开启, 1=不开启")
    private Byte      passiveSeeker;
    @ApiModelProperty(value = "授权大岂第三方平台0：未授权 1：授权了")
    private Byte      thirdOauth;
    @ApiModelProperty(value = "是否启用免费雇主注册，0：不启用，1：启用")
    private Byte      hrRegister;
    @ApiModelProperty(value = "access_token最新更新时间")
    private Integer   accessTokenCreateTime;
    @ApiModelProperty(value = "access_token过期时间")
    private Integer   accessTokenExpired;
    @ApiModelProperty(value = "access_token")
    private String    accessToken;
    private String    jsapiTicket;
    @ApiModelProperty(value = "是否授权0：无关，1：授权2：解除授权")
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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public Integer getWelcome() {
        return welcome;
    }

    public void setWelcome(Integer welcome) {
        this.welcome = welcome;
    }

    public Integer getDefault_() {
        return default_;
    }

    public void setDefault_(Integer default_) {
        this.default_ = default_;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public Byte getPassiveSeeker() {
        return passiveSeeker;
    }

    public void setPassiveSeeker(Byte passiveSeeker) {
        this.passiveSeeker = passiveSeeker;
    }

    public Byte getThirdOauth() {
        return thirdOauth;
    }

    public void setThirdOauth(Byte thirdOauth) {
        this.thirdOauth = thirdOauth;
    }

    public Byte getHrRegister() {
        return hrRegister;
    }

    public void setHrRegister(Byte hrRegister) {
        this.hrRegister = hrRegister;
    }

    public Integer getAccessTokenCreateTime() {
        return accessTokenCreateTime;
    }

    public void setAccessTokenCreateTime(Integer accessTokenCreateTime) {
        this.accessTokenCreateTime = accessTokenCreateTime;
    }

    public Integer getAccessTokenExpired() {
        return accessTokenExpired;
    }

    public void setAccessTokenExpired(Integer accessTokenExpired) {
        this.accessTokenExpired = accessTokenExpired;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getJsapiTicket() {
        return jsapiTicket;
    }

    public void setJsapiTicket(String jsapiTicket) {
        this.jsapiTicket = jsapiTicket;
    }

    public Byte getAuthorized() {
        return authorized;
    }

    public void setAuthorized(Byte authorized) {
        this.authorized = authorized;
    }

    public Integer getUnauthorizedTime() {
        return unauthorizedTime;
    }

    public void setUnauthorizedTime(Integer unauthorizedTime) {
        this.unauthorizedTime = unauthorizedTime;
    }

    public String getAuthorizerRefreshToken() {
        return authorizerRefreshToken;
    }

    public void setAuthorizerRefreshToken(String authorizerRefreshToken) {
        this.authorizerRefreshToken = authorizerRefreshToken;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getShowQxQrcode() {
        return showQxQrcode;
    }

    public void setShowQxQrcode(Integer showQxQrcode) {
        this.showQxQrcode = showQxQrcode;
    }

    public Integer getShowCustomTheme() {
        return showCustomTheme;
    }

    public void setShowCustomTheme(Integer showCustomTheme) {
        this.showCustomTheme = showCustomTheme;
    }
}
