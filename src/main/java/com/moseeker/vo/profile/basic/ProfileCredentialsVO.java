/*
 * This file is generated by jOOQ.
*/
package com.moseeker.vo.profile.basic;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import javax.annotation.Generated;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;


/**
 * Profile的证书表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileCredentialsVO implements Serializable {

    private static final long serialVersionUID = -149897411;

    private Integer   id;
    private Integer   profileId;
    private String    name;
    private String    organization;
    private String    code;
    private String    url;
    private Date      getDate;
    private String    score;
    @ApiModelProperty(value = "创建时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;
    @ApiModelProperty(value = "更新时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;

    public ProfileCredentialsVO() {}

    public ProfileCredentialsVO(ProfileCredentialsVO value) {
        this.id = value.id;
        this.profileId = value.profileId;
        this.name = value.name;
        this.organization = value.organization;
        this.code = value.code;
        this.url = value.url;
        this.getDate = value.getDate;
        this.score = value.score;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public ProfileCredentialsVO(
        Integer   id,
        Integer   profileId,
        String    name,
        String    organization,
        String    code,
        String    url,
        Date      getDate,
        String    score,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.profileId = profileId;
        this.name = name;
        this.organization = organization;
        this.code = code;
        this.url = url;
        this.getDate = getDate;
        this.score = score;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProfileId() {
        return this.profileId;
    }

    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganization() {
        return this.organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getGetDate() {
        return this.getDate;
    }

    public void setGetDate(Date getDate) {
        this.getDate = getDate;
    }

    public String getScore() {
        return this.score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ProfileCredentialsVO (");

        sb.append(id);
        sb.append(", ").append(profileId);
        sb.append(", ").append(name);
        sb.append(", ").append(organization);
        sb.append(", ").append(code);
        sb.append(", ").append(url);
        sb.append(", ").append(getDate);
        sb.append(", ").append(score);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}