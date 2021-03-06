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
 * Profile的获得奖项表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileAwardsVO implements Serializable {

    private static final long serialVersionUID = -1435942116;

    private Integer   id;
    private Integer   profileId;
    private Date      rewardDate;
    private String    name;
    private String    awardWinningStatus;
    private String    level;
    private String    description;
    @ApiModelProperty(value = "创建时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;
    @ApiModelProperty(value = "更新时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;

    public ProfileAwardsVO() {}

    public ProfileAwardsVO(ProfileAwardsVO value) {
        this.id = value.id;
        this.profileId = value.profileId;
        this.rewardDate = value.rewardDate;
        this.name = value.name;
        this.awardWinningStatus = value.awardWinningStatus;
        this.level = value.level;
        this.description = value.description;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public ProfileAwardsVO(
        Integer   id,
        Integer   profileId,
        Date      rewardDate,
        String    name,
        String    awardWinningStatus,
        String    level,
        String    description,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.profileId = profileId;
        this.rewardDate = rewardDate;
        this.name = name;
        this.awardWinningStatus = awardWinningStatus;
        this.level = level;
        this.description = description;
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

    public Date getRewardDate() {
        return this.rewardDate;
    }

    public void setRewardDate(Date rewardDate) {
        this.rewardDate = rewardDate;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAwardWinningStatus() {
        return this.awardWinningStatus;
    }

    public void setAwardWinningStatus(String awardWinningStatus) {
        this.awardWinningStatus = awardWinningStatus;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        StringBuilder sb = new StringBuilder("ProfileAwardsVO (");

        sb.append(id);
        sb.append(", ").append(profileId);
        sb.append(", ").append(rewardDate);
        sb.append(", ").append(name);
        sb.append(", ").append(awardWinningStatus);
        sb.append(", ").append(level);
        sb.append(", ").append(description);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
