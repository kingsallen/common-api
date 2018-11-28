/*
 * This file is generated by jOOQ.
 */
package com.moseeker.vo.profile.basic;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.annotation.Generated;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * Profile的语言
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.6"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
@ApiModel(value = "Profile的语言")
public class ProfileLanguageVO implements Serializable {

    private static final long serialVersionUID = -467704526;

    @ApiModelProperty(value = "主键ID", example = "1")
    private Integer id;
    @ApiModelProperty(value = "简历ID", example = "1")
    private Integer profileId;
    @ApiModelProperty(value = "语言", example = "英语")
    private String name;
    @ApiModelProperty(value = "掌握程度", dataType = "java.lang.Integer", example = "1")
    private Byte level;
    @ApiModelProperty(value = "创建时间", dataType = "java.lang.String", example = "2018-11-16 16:00:00")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;
    @ApiModelProperty(value = "更新时间", dataType = "java.lang.String", example = "2018-11-16 16:00:00")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;

    public ProfileLanguageVO() {
    }

    public ProfileLanguageVO(ProfileLanguageVO value) {
        this.id = value.id;
        this.profileId = value.profileId;
        this.name = value.name;
        this.level = value.level;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public ProfileLanguageVO(
            Integer id,
            Integer profileId,
            String name,
            Byte level,
            Timestamp createTime,
            Timestamp updateTime
    ) {
        this.id = id;
        this.profileId = profileId;
        this.name = name;
        this.level = level;
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

    public Byte getLevel() {
        return this.level;
    }

    public void setLevel(Byte level) {
        this.level = level;
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
        StringBuilder sb = new StringBuilder("ProfileLanguageVO (");

        sb.append(id);
        sb.append(", ").append(profileId);
        sb.append(", ").append(name);
        sb.append(", ").append(level);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
