/*
 * This file is generated by jOOQ.
*/
package com.moseeker.vo.profile.basic;


import javax.annotation.Generated;
import java.io.Serializable;


/**
 * profile各个部分完成度表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileCompletenessVO implements Serializable {

    private static final long serialVersionUID = 1079339099;

    private Integer profileId;
    private Integer userUser;
    private Integer profileBasic;
    private Integer profileWorkexp;
    private Integer profileEducation;
    private Integer profileProjectexp;
    private Integer profileLanguage;
    private Integer profileSkill;
    private Integer profileCredentials;
    private Integer profileAwards;
    private Integer profileWorks;
    private Integer profileIntention;

    public ProfileCompletenessVO() {}

    public ProfileCompletenessVO(ProfileCompletenessVO value) {
        this.profileId = value.profileId;
        this.userUser = value.userUser;
        this.profileBasic = value.profileBasic;
        this.profileWorkexp = value.profileWorkexp;
        this.profileEducation = value.profileEducation;
        this.profileProjectexp = value.profileProjectexp;
        this.profileLanguage = value.profileLanguage;
        this.profileSkill = value.profileSkill;
        this.profileCredentials = value.profileCredentials;
        this.profileAwards = value.profileAwards;
        this.profileWorks = value.profileWorks;
        this.profileIntention = value.profileIntention;
    }

    public ProfileCompletenessVO(
        Integer profileId,
        Integer userUser,
        Integer profileBasic,
        Integer profileWorkexp,
        Integer profileEducation,
        Integer profileProjectexp,
        Integer profileLanguage,
        Integer profileSkill,
        Integer profileCredentials,
        Integer profileAwards,
        Integer profileWorks,
        Integer profileIntention
    ) {
        this.profileId = profileId;
        this.userUser = userUser;
        this.profileBasic = profileBasic;
        this.profileWorkexp = profileWorkexp;
        this.profileEducation = profileEducation;
        this.profileProjectexp = profileProjectexp;
        this.profileLanguage = profileLanguage;
        this.profileSkill = profileSkill;
        this.profileCredentials = profileCredentials;
        this.profileAwards = profileAwards;
        this.profileWorks = profileWorks;
        this.profileIntention = profileIntention;
    }

    public Integer getProfileId() {
        return this.profileId;
    }

    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }

    public Integer getUserUser() {
        return this.userUser;
    }

    public void setUserUser(Integer userUser) {
        this.userUser = userUser;
    }

    public Integer getProfileBasic() {
        return this.profileBasic;
    }

    public void setProfileBasic(Integer profileBasic) {
        this.profileBasic = profileBasic;
    }

    public Integer getProfileWorkexp() {
        return this.profileWorkexp;
    }

    public void setProfileWorkexp(Integer profileWorkexp) {
        this.profileWorkexp = profileWorkexp;
    }

    public Integer getProfileEducation() {
        return this.profileEducation;
    }

    public void setProfileEducation(Integer profileEducation) {
        this.profileEducation = profileEducation;
    }

    public Integer getProfileProjectexp() {
        return this.profileProjectexp;
    }

    public void setProfileProjectexp(Integer profileProjectexp) {
        this.profileProjectexp = profileProjectexp;
    }

    public Integer getProfileLanguage() {
        return this.profileLanguage;
    }

    public void setProfileLanguage(Integer profileLanguage) {
        this.profileLanguage = profileLanguage;
    }

    public Integer getProfileSkill() {
        return this.profileSkill;
    }

    public void setProfileSkill(Integer profileSkill) {
        this.profileSkill = profileSkill;
    }

    public Integer getProfileCredentials() {
        return this.profileCredentials;
    }

    public void setProfileCredentials(Integer profileCredentials) {
        this.profileCredentials = profileCredentials;
    }

    public Integer getProfileAwards() {
        return this.profileAwards;
    }

    public void setProfileAwards(Integer profileAwards) {
        this.profileAwards = profileAwards;
    }

    public Integer getProfileWorks() {
        return this.profileWorks;
    }

    public void setProfileWorks(Integer profileWorks) {
        this.profileWorks = profileWorks;
    }

    public Integer getProfileIntention() {
        return this.profileIntention;
    }

    public void setProfileIntention(Integer profileIntention) {
        this.profileIntention = profileIntention;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ProfileCompletenessVO (");

        sb.append(profileId);
        sb.append(", ").append(userUser);
        sb.append(", ").append(profileBasic);
        sb.append(", ").append(profileWorkexp);
        sb.append(", ").append(profileEducation);
        sb.append(", ").append(profileProjectexp);
        sb.append(", ").append(profileLanguage);
        sb.append(", ").append(profileSkill);
        sb.append(", ").append(profileCredentials);
        sb.append(", ").append(profileAwards);
        sb.append(", ").append(profileWorks);
        sb.append(", ").append(profileIntention);

        sb.append(")");
        return sb.toString();
    }
}