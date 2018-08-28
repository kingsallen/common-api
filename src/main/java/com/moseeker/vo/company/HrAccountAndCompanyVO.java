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
