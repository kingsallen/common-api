/*
 * This file is generated by jOOQ.
*/
package com.moseeker.vo.profile.basic;


import javax.annotation.Generated;
import java.io.Serializable;


/**
 * Profile的求职意向-行业关系表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileIntentionIndustryVO implements Serializable {

    private static final long serialVersionUID = 900064850;

    private Integer id;
    private Integer profileIntentionId;
    private Integer industryCode;
    private String  industryName;

    public ProfileIntentionIndustryVO() {}

    public ProfileIntentionIndustryVO(ProfileIntentionIndustryVO value) {
        this.id = value.id;
        this.profileIntentionId = value.profileIntentionId;
        this.industryCode = value.industryCode;
        this.industryName = value.industryName;
    }

    public ProfileIntentionIndustryVO(
        Integer id,
        Integer profileIntentionId,
        Integer industryCode,
        String  industryName
    ) {
        this.id = id;
        this.profileIntentionId = profileIntentionId;
        this.industryCode = industryCode;
        this.industryName = industryName;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProfileIntentionId() {
        return this.profileIntentionId;
    }

    public void setProfileIntentionId(Integer profileIntentionId) {
        this.profileIntentionId = profileIntentionId;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ProfileIntentionIndustryVO (");

        sb.append(id);
        sb.append(", ").append(profileIntentionId);
        sb.append(", ").append(industryCode);
        sb.append(", ").append(industryName);

        sb.append(")");
        return sb.toString();
    }
}
