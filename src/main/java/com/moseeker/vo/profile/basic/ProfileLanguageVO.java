package com.moseeker.vo.profile.basic;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.annotation.Generated;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * Profile的语言
 */
@ApiModel(value = "Profile的语言")
@Data
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
}
