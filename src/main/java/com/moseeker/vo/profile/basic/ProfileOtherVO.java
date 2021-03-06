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
public class ProfileOtherVO implements Serializable {

    private static final long serialVersionUID = 235288756;

    @ApiModelProperty(value = "profileId", example = "2")
    private Integer   profileId;
    @ApiModelProperty(value = "other", example = "{\"gender\":\"男\",\"weight\":69,\"height\":178}")
    private String    other;
    @ApiModelProperty(value = "创建时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;
    @ApiModelProperty(value = "更新时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;

    public ProfileOtherVO() {}

    public ProfileOtherVO(ProfileOtherVO value) {
        this.profileId = value.profileId;
        this.other = value.other;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public ProfileOtherVO(
        Integer   profileId,
        String    other,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.profileId = profileId;
        this.other = other;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getProfileId() {
        return this.profileId;
    }

    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }

    public String getOther() {
        return this.other;
    }

    public void setOther(String other) {
        this.other = other;
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
        StringBuilder sb = new StringBuilder("ProfileOtherVO (");

        sb.append(profileId);
        sb.append(", ").append(other);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
