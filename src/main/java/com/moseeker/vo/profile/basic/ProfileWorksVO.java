package com.moseeker.vo.profile.basic;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * Profile的个人作品
 */
@Data
@ApiModel(value = "个人作品")
public class ProfileWorksVO implements Serializable {

    @ApiModelProperty(value = "主键id", example = "1")
    private Integer id;
    @ApiModelProperty(value = "简历ID", example = "1")
    private Integer profileId;
    @ApiModelProperty(value = "作品名称", example = "nameExmaple")
    private String name;
    @ApiModelProperty(value = "作品网址", example = "https://url.com")
    private String url;
    @ApiModelProperty(value = "作品封面", example = "coverExample")
    private String cover;
    @ApiModelProperty(value = "作品描述", example = "descriptionExample")
    private String description;
    @ApiModelProperty(value = "创建时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;
    @ApiModelProperty(value = "更新时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;

}
