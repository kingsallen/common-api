/*
 * This file is generated by jOOQ.
*/
package com.moseeker.vo.company.basic;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.sql.Timestamp;


/**
 * 团队信息
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(description = "团队信息")
public class HrTeamVO {
    private Integer   id;
    @ApiModelProperty(value = "团队/部门名称")
    private String    name;
    @ApiModelProperty(value = "职能概述")
    private String    summary;
    @ApiModelProperty(value = "团队介绍")
    private String    description;
    @ApiModelProperty(value = "团队显示顺序")
    private Integer   showOrder;
    @ApiModelProperty(value = "成员一天信息hr_media.id: [1, 23, 32]")
    private String    jdMedia;
    private Integer   companyId;
    @ApiModelProperty(value = "创建时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;
    @ApiModelProperty(value = "更新时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;
    @ApiModelProperty(value = "当前团队在列表等处是否显示, 0:不显示, 1:显示")
    private Integer   isShow;
    @ApiModelProperty(value = "团队标语")
    private String    slogan;
    @ApiModelProperty(value = "团队主图片hr_resource.id")
    private Integer   resId;
    @ApiModelProperty(value = "团队详情页配置hr_media.id: [1, 23, 32]")
    private String    teamDetail;
    @ApiModelProperty(value = "0是正常 1是删除")
    private Integer   disable;
    @ApiModelProperty(value = "团队小标题")
    private String    subTitle;
    @ApiModelProperty(value = "模板链接")
    private String    link;

}