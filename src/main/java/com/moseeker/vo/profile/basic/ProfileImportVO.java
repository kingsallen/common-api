/*
 * This file is generated by jOOQ.
*/
package com.moseeker.vo.profile.basic;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import javax.annotation.Generated;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 用户profile导入记录信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileImportVO implements Serializable {

    private static final long serialVersionUID = -204837817;

    private Integer   profileId;
    @ApiModelProperty(value = "source", dataType = "java.lang.Integer", example = "1")
    private Byte      source;
    @ApiModelProperty(value = "lastUpdateTime", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp lastUpdateTime;
    private String    accountId;
    private String    resumeId;
    private String    userName;
    @ApiModelProperty(value = "创建时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;
    @ApiModelProperty(value = "更新时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;
    private String    data;

    public ProfileImportVO() {}

    public ProfileImportVO(ProfileImportVO value) {
        this.profileId = value.profileId;
        this.source = value.source;
        this.lastUpdateTime = value.lastUpdateTime;
        this.accountId = value.accountId;
        this.resumeId = value.resumeId;
        this.userName = value.userName;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.data = value.data;
    }

    public ProfileImportVO(
        Integer   profileId,
        Byte      source,
        Timestamp lastUpdateTime,
        String    accountId,
        String    resumeId,
        String    userName,
        Timestamp createTime,
        Timestamp updateTime,
        String    data
    ) {
        this.profileId = profileId;
        this.source = source;
        this.lastUpdateTime = lastUpdateTime;
        this.accountId = accountId;
        this.resumeId = resumeId;
        this.userName = userName;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.data = data;
    }

    public Integer getProfileId() {
        return this.profileId;
    }

    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }

    public Byte getSource() {
        return this.source;
    }

    public void setSource(Byte source) {
        this.source = source;
    }

    public Timestamp getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public void setLastUpdateTime(Timestamp lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getResumeId() {
        return this.resumeId;
    }

    public void setResumeId(String resumeId) {
        this.resumeId = resumeId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ProfileImportVO (");

        sb.append(profileId);
        sb.append(", ").append(source);
        sb.append(", ").append(lastUpdateTime);
        sb.append(", ").append(accountId);
        sb.append(", ").append(resumeId);
        sb.append(", ").append(userName);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(data);

        sb.append(")");
        return sb.toString();
    }
}
