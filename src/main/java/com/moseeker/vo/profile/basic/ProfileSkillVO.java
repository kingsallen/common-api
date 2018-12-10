package com.moseeker.vo.profile.basic;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * Profile的技能
 */

@Data
@ApiModel("简历的技能")
public class ProfileSkillVO implements Serializable {

    private static final long serialVersionUID = -1006039530;

    @ApiModelProperty(value = "主键", example = "2018")
    private Integer id;
    @ApiModelProperty(value = "profile.id", example = "88")
    private Integer profileId;
    @ApiModelProperty(value = "技能名称", example = "Java")
    private String name;
    @ApiModelProperty(value = "掌握程度 0:未填写 1:了解, 2:掌握 3:熟练 4:精通", dataType = "Integer", example = "2")
    private Byte level;
    @ApiModelProperty(value = "使用时长（月）", example = "10", dataType = "Integer")
    private Integer month;

    @ApiModelProperty(name = "createTime", value = "创建时间", dataType = "string", example = "2018-11-29 15:30:00")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;
    @ApiModelProperty(name = "updateTime", value = "更新时间", dataType = "string", example = "2018-11-29 15:30:00")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;
}
