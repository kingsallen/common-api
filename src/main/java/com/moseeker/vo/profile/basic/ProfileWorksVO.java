package com.moseeker.vo.profile.basic;


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
    @ApiModelProperty(value = "创建时间", dataType = "java.lang.String", example = "2018-12-10 10:12:45")
    private Timestamp createTime;
    @ApiModelProperty(value = "更新时间", dataType = "java.lang.String", example = "2018-12-10 10:12:45")
    private Timestamp updateTime;

}
