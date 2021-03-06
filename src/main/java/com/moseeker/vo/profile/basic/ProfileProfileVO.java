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
 * 用户profile表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileProfileVO implements Serializable {

    private static final long serialVersionUID = -1537189025;

    private Integer   id;
    private String    uuid;
    @ApiModelProperty(value = "lang", dataType = "java.lang.Integer", example = "1")
    private Byte      lang;
    private Integer   source;
    @ApiModelProperty(value = "completeness", dataType = "java.lang.Integer", example = "1")
    private Byte      completeness;
    private Integer   userId;
    @ApiModelProperty(value = "disable", dataType = "java.lang.Integer", example = "1")
    private Byte      disable;
    @ApiModelProperty(value = "创建时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;
    @ApiModelProperty(value = "更新时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;
    private String    origin;

    public ProfileProfileVO() {}

    public ProfileProfileVO(ProfileProfileVO value) {
        this.id = value.id;
        this.uuid = value.uuid;
        this.lang = value.lang;
        this.source = value.source;
        this.completeness = value.completeness;
        this.userId = value.userId;
        this.disable = value.disable;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.origin = value.origin;
    }

    public ProfileProfileVO(
        Integer   id,
        String    uuid,
        Byte      lang,
        Integer   source,
        Byte      completeness,
        Integer   userId,
        Byte      disable,
        Timestamp createTime,
        Timestamp updateTime,
        String    origin
    ) {
        this.id = id;
        this.uuid = uuid;
        this.lang = lang;
        this.source = source;
        this.completeness = completeness;
        this.userId = userId;
        this.disable = disable;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.origin = origin;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Byte getLang() {
        return this.lang;
    }

    public void setLang(Byte lang) {
        this.lang = lang;
    }

    public Integer getSource() {
        return this.source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Byte getCompleteness() {
        return this.completeness;
    }

    public void setCompleteness(Byte completeness) {
        this.completeness = completeness;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Byte getDisable() {
        return this.disable;
    }

    public void setDisable(Byte disable) {
        this.disable = disable;
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

    public String getOrigin() {
        return this.origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ProfileProfileVO (");

        sb.append(id);
        sb.append(", ").append(uuid);
        sb.append(", ").append(lang);
        sb.append(", ").append(source);
        sb.append(", ").append(completeness);
        sb.append(", ").append(userId);
        sb.append(", ").append(disable);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(origin);

        sb.append(")");
        return sb.toString();
    }
}
