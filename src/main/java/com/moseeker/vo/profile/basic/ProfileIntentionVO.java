/*
 * This file is generated by jOOQ.
*/
package com.moseeker.vo.profile.basic;


import javax.annotation.Generated;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * Profile的求职意向
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileIntentionVO implements Serializable {

    private static final long serialVersionUID = -1715008600;

    private Integer   id;
    private Integer   profileId;
    private Byte      worktype;
    private Byte      workstate;
    private Byte      salaryCode;
    private String    tag;
    private Byte      considerVentureCompanyOpportunities;
    private Timestamp createTime;
    private Timestamp updateTime;

    public ProfileIntentionVO() {}

    public ProfileIntentionVO(ProfileIntentionVO value) {
        this.id = value.id;
        this.profileId = value.profileId;
        this.worktype = value.worktype;
        this.workstate = value.workstate;
        this.salaryCode = value.salaryCode;
        this.tag = value.tag;
        this.considerVentureCompanyOpportunities = value.considerVentureCompanyOpportunities;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public ProfileIntentionVO(
        Integer   id,
        Integer   profileId,
        Byte      worktype,
        Byte      workstate,
        Byte      salaryCode,
        String    tag,
        Byte      considerVentureCompanyOpportunities,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.profileId = profileId;
        this.worktype = worktype;
        this.workstate = workstate;
        this.salaryCode = salaryCode;
        this.tag = tag;
        this.considerVentureCompanyOpportunities = considerVentureCompanyOpportunities;
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

    public Byte getWorktype() {
        return this.worktype;
    }

    public void setWorktype(Byte worktype) {
        this.worktype = worktype;
    }

    public Byte getWorkstate() {
        return this.workstate;
    }

    public void setWorkstate(Byte workstate) {
        this.workstate = workstate;
    }

    public Byte getSalaryCode() {
        return this.salaryCode;
    }

    public void setSalaryCode(Byte salaryCode) {
        this.salaryCode = salaryCode;
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Byte getConsiderVentureCompanyOpportunities() {
        return this.considerVentureCompanyOpportunities;
    }

    public void setConsiderVentureCompanyOpportunities(Byte considerVentureCompanyOpportunities) {
        this.considerVentureCompanyOpportunities = considerVentureCompanyOpportunities;
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
        StringBuilder sb = new StringBuilder("ProfileIntentionVO (");

        sb.append(id);
        sb.append(", ").append(profileId);
        sb.append(", ").append(worktype);
        sb.append(", ").append(workstate);
        sb.append(", ").append(salaryCode);
        sb.append(", ").append(tag);
        sb.append(", ").append(considerVentureCompanyOpportunities);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
