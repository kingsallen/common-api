/*
 * This file is generated by jOOQ.
*/
package com.moseeker.vo.profile.basic;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.annotation.Generated;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;


/**
 * Profile的项目经验
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileProjectexpVO implements Serializable {

    private static final long serialVersionUID = 1474657928;

    private Integer   id;
    private Integer   profileId;
    private Date      start;
    private Date      end;
    private Byte      endUntilNow;
    private String    name;
    private String    companyName;
    private Byte      isIt;
    private String    devTool;
    private String    hardware;
    private String    software;
    private String    url;
    private String    description;
    private String    role;
    private String    responsibility;
    private String    achievement;
    private String    member;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;

    public ProfileProjectexpVO() {}

    public ProfileProjectexpVO(ProfileProjectexpVO value) {
        this.id = value.id;
        this.profileId = value.profileId;
        this.start = value.start;
        this.end = value.end;
        this.endUntilNow = value.endUntilNow;
        this.name = value.name;
        this.companyName = value.companyName;
        this.isIt = value.isIt;
        this.devTool = value.devTool;
        this.hardware = value.hardware;
        this.software = value.software;
        this.url = value.url;
        this.description = value.description;
        this.role = value.role;
        this.responsibility = value.responsibility;
        this.achievement = value.achievement;
        this.member = value.member;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public ProfileProjectexpVO(
        Integer   id,
        Integer   profileId,
        Date      start,
        Date      end,
        Byte      endUntilNow,
        String    name,
        String    companyName,
        Byte      isIt,
        String    devTool,
        String    hardware,
        String    software,
        String    url,
        String    description,
        String    role,
        String    responsibility,
        String    achievement,
        String    member,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.profileId = profileId;
        this.start = start;
        this.end = end;
        this.endUntilNow = endUntilNow;
        this.name = name;
        this.companyName = companyName;
        this.isIt = isIt;
        this.devTool = devTool;
        this.hardware = hardware;
        this.software = software;
        this.url = url;
        this.description = description;
        this.role = role;
        this.responsibility = responsibility;
        this.achievement = achievement;
        this.member = member;
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

    public Date getStart() {
        return this.start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return this.end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Byte getEndUntilNow() {
        return this.endUntilNow;
    }

    public void setEndUntilNow(Byte endUntilNow) {
        this.endUntilNow = endUntilNow;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Byte getIsIt() {
        return this.isIt;
    }

    public void setIsIt(Byte isIt) {
        this.isIt = isIt;
    }

    public String getDevTool() {
        return this.devTool;
    }

    public void setDevTool(String devTool) {
        this.devTool = devTool;
    }

    public String getHardware() {
        return this.hardware;
    }

    public void setHardware(String hardware) {
        this.hardware = hardware;
    }

    public String getSoftware() {
        return this.software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getResponsibility() {
        return this.responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

    public String getAchievement() {
        return this.achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    public String getMember() {
        return this.member;
    }

    public void setMember(String member) {
        this.member = member;
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
        StringBuilder sb = new StringBuilder("ProfileProjectexpVO (");

        sb.append(id);
        sb.append(", ").append(profileId);
        sb.append(", ").append(start);
        sb.append(", ").append(end);
        sb.append(", ").append(endUntilNow);
        sb.append(", ").append(name);
        sb.append(", ").append(companyName);
        sb.append(", ").append(isIt);
        sb.append(", ").append(devTool);
        sb.append(", ").append(hardware);
        sb.append(", ").append(software);
        sb.append(", ").append(url);
        sb.append(", ").append(description);
        sb.append(", ").append(role);
        sb.append(", ").append(responsibility);
        sb.append(", ").append(achievement);
        sb.append(", ").append(member);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
