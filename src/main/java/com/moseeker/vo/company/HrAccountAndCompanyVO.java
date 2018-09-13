package com.moseeker.vo.company;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.sql.Timestamp;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/5/15.
 */

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(description = "注册信息")
public class HrAccountAndCompanyVO {
    private String code;
    private Integer   id;
    private Integer   companyId;
    private String    mobile;
    private String    email;
    private Integer   wxuserId;
    private String    password;
    @ApiModelProperty(value = "Hr名称")
    private String    username;
    @ApiModelProperty(value = "0 超级账号；1：子账号; 2：普通账号")
    private Integer   accountType;
    @ApiModelProperty(value = "子账号邀请使用，账号是否激活，1：激活；0：未激活")
    private Byte      activation;
    private Timestamp registerTime;
    private String    registerIp;
    private Timestamp lastLoginTime;
    private String    lastLoginIp;
    private Integer   loginCount;
    @ApiModelProperty(value = "hr来源1:雇主 2:官网 3:微信扫描 4:我也要招人(聚合号) 5:我也要招人(企业号) 6:我也要招人(手机官网)")
    private Integer   source;
    @ApiModelProperty(value = "下载行业报告校验码")
    private String    downloadToken;
    @ApiModelProperty(value = "头像url")
    private String    headimgurl;
    @ApiModelProperty(value = "HR聊天是否托管给智能招聘助手，0 不托管，1 托管")
    private Byte      leaveToMobot;
    @ApiModelProperty(value = "公司添加来源 0:hr系统, 1:官网下载行业报告, 6:无线官网添加, 7:PC端 添加, 8:微信端添加, 9:PC导入, 10:微信端导入, 11 : 程序导入（和黄导入）")
    private Byte   companySource;
    private String    name;
    @ApiModelProperty(value = "公司区分(其它:2,免费用户:1,企业用户:0)")
    private Byte      type;
    @ApiModelProperty(value = "公司介绍")
    private String    introduction;
    @ApiModelProperty(value = "公司规模")
    private Byte      scale;
    private String    address;
    @ApiModelProperty(value = "公司性质 0:未填写 1:外商独资 3:国企 4:合资 5:民营公司 6:事业单位 7:上市公司 8:政府机关/非盈利机构 10:代表处 11:股份制企业 12:创业公司 13:其它")
    private Byte      property;
    private String    industry;
    @ApiModelProperty(value = "公司主页")
    private String    homepage;
    @ApiModelProperty(value = "公司logo的网络cdn地址")
    private String    logo;
    @ApiModelProperty(value = "公司简称")
    private String    abbreviation;
    @ApiModelProperty(value = "json格式的企业印象")
    private String    impression;
    @ApiModelProperty(value = "json格式的企业banner")
    private String    banner;
    private Integer   parentId;
    private Integer   hraccountId;
    @ApiModelProperty(value = "公司口号")
    private String    slogan;
    private String    feature;
    @ApiModelProperty(value = "是否世界500强，0：不是 1：是")
    private Byte      fortune;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getWxuserId() {
        return wxuserId;
    }

    public void setWxuserId(Integer wxuserId) {
        this.wxuserId = wxuserId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public Byte getActivation() {
        return activation;
    }

    public void setActivation(Byte activation) {
        this.activation = activation;
    }

    public Timestamp getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Timestamp registerTime) {
        this.registerTime = registerTime;
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }

    public Timestamp getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getDownloadToken() {
        return downloadToken;
    }

    public void setDownloadToken(String downloadToken) {
        this.downloadToken = downloadToken;
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public Byte getLeaveToMobot() {
        return leaveToMobot;
    }

    public void setLeaveToMobot(Byte leaveToMobot) {
        this.leaveToMobot = leaveToMobot;
    }

    public Byte getCompanySource() {
        return companySource;
    }

    public void setCompanySource(Byte companySource) {
        this.companySource = companySource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Byte getScale() {
        return scale;
    }

    public void setScale(Byte scale) {
        this.scale = scale;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Byte getProperty() {
        return property;
    }

    public void setProperty(Byte property) {
        this.property = property;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getImpression() {
        return impression;
    }

    public void setImpression(String impression) {
        this.impression = impression;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getHraccountId() {
        return hraccountId;
    }

    public void setHraccountId(Integer hraccountId) {
        this.hraccountId = hraccountId;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public Byte getFortune() {
        return fortune;
    }

    public void setFortune(Byte fortune) {
        this.fortune = fortune;
    }
}
