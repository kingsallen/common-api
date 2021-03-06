/*
 * This file is generated by jOOQ.
*/
package com.moseeker.vo.profile.basic;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.annotation.Generated;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;


/**
 * Profile的工作经历
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileWorkexpVO implements Serializable {

    private static final long serialVersionUID = -1559719335;

    private Integer   id;
    private Integer   profileId;
    private Date      start;
    private Date      end;
    @ApiModelProperty(value = "endUntilNow", dataType = "java.lang.Integer", example = "1")
    private Byte      endUntilNow;
    @ApiModelProperty(value = "salaryCode", dataType = "java.lang.Integer", example = "1")
    private Byte      salaryCode;
    private Integer   industryCode;
    private String    industryName;
    private Integer   companyId;
    @ApiModelProperty(name = "companyName", value = "公司名称")
    private String   companyName;
    private String    departmentName;
    private Integer   positionCode;
    private String    positionName;
    private String    description;
    @ApiModelProperty(value = "type", dataType = "java.lang.Integer", example = "1")
    private Byte      type;
    private Integer   cityCode;
    private String    cityName;
    private String    reportTo;
    private Integer   underlings;
    private String    reference;
    private String    resignReason;
    private String    achievement;
    @ApiModelProperty(value = "创建时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;
    @ApiModelProperty(value = "更新时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;
    private String    job;

    public ProfileWorkexpVO() {}

    public ProfileWorkexpVO(ProfileWorkexpVO value) {
        this.id = value.id;
        this.profileId = value.profileId;
        this.start = value.start;
        this.end = value.end;
        this.endUntilNow = value.endUntilNow;
        this.salaryCode = value.salaryCode;
        this.industryCode = value.industryCode;
        this.industryName = value.industryName;
        this.companyId = value.companyId;
        this.companyName =value.companyName;
        this.departmentName = value.departmentName;
        this.positionCode = value.positionCode;
        this.positionName = value.positionName;
        this.description = value.description;
        this.type = value.type;
        this.cityCode = value.cityCode;
        this.cityName = value.cityName;
        this.reportTo = value.reportTo;
        this.underlings = value.underlings;
        this.reference = value.reference;
        this.resignReason = value.resignReason;
        this.achievement = value.achievement;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.job = value.job;
    }

    public ProfileWorkexpVO(
        Integer   id,
        Integer   profileId,
        Date      start,
        Date      end,
        Byte      endUntilNow,
        Byte      salaryCode,
        Integer   industryCode,
        String    industryName,
        Integer   companyId,
        String    companyName,
        String    departmentName,
        Integer   positionCode,
        String    positionName,
        String    description,
        Byte      type,
        Integer   cityCode,
        String    cityName,
        String    reportTo,
        Integer   underlings,
        String    reference,
        String    resignReason,
        String    achievement,
        Timestamp createTime,
        Timestamp updateTime,
        String    job
    ) {
        this.id = id;
        this.profileId = profileId;
        this.start = start;
        this.end = end;
        this.endUntilNow = endUntilNow;
        this.salaryCode = salaryCode;
        this.industryCode = industryCode;
        this.industryName = industryName;
        this.companyId = companyId;
        this.companyName = companyName;
        this.departmentName = departmentName;
        this.positionCode = positionCode;
        this.positionName = positionName;
        this.description = description;
        this.type = type;
        this.cityCode = cityCode;
        this.cityName = cityName;
        this.reportTo = reportTo;
        this.underlings = underlings;
        this.reference = reference;
        this.resignReason = resignReason;
        this.achievement = achievement;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.job = job;
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

    public Byte getSalaryCode() {
        return this.salaryCode;
    }

    public void setSalaryCode(Byte salaryCode) {
        this.salaryCode = salaryCode;
    }

    public Integer getIndustryCode() {
        return this.industryCode;
    }

    public void setIndustryCode(Integer industryCode) {
        this.industryCode = industryCode;
    }

    public String getIndustryName() {
        return this.industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getPositionCode() {
        return this.positionCode;
    }

    public void setPositionCode(Integer positionCode) {
        this.positionCode = positionCode;
    }

    public String getPositionName() {
        return this.positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Byte getType() {
        return this.type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getCityCode() {
        return this.cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getReportTo() {
        return this.reportTo;
    }

    public void setReportTo(String reportTo) {
        this.reportTo = reportTo;
    }

    public Integer getUnderlings() {
        return this.underlings;
    }

    public void setUnderlings(Integer underlings) {
        this.underlings = underlings;
    }

    public String getReference() {
        return this.reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getResignReason() {
        return this.resignReason;
    }

    public void setResignReason(String resignReason) {
        this.resignReason = resignReason;
    }

    public String getAchievement() {
        return this.achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
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

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ProfileWorkexpVO (");

        sb.append(id);
        sb.append(", ").append(profileId);
        sb.append(", ").append(start);
        sb.append(", ").append(end);
        sb.append(", ").append(endUntilNow);
        sb.append(", ").append(salaryCode);
        sb.append(", ").append(industryCode);
        sb.append(", ").append(industryName);
        sb.append(", ").append(companyId);
        sb.append(", ").append(companyName);
        sb.append(", ").append(departmentName);
        sb.append(", ").append(positionCode);
        sb.append(", ").append(positionName);
        sb.append(", ").append(description);
        sb.append(", ").append(type);
        sb.append(", ").append(cityCode);
        sb.append(", ").append(cityName);
        sb.append(", ").append(reportTo);
        sb.append(", ").append(underlings);
        sb.append(", ").append(reference);
        sb.append(", ").append(resignReason);
        sb.append(", ").append(achievement);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(job);

        sb.append(")");
        return sb.toString();
    }
}
