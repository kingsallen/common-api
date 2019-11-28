package com.moseeker.vo.application;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author: huangwenjian
 * @desc:
 * @since: 2019-11-26 12:03
 */
@Data
public class ApplicationChannelVO {

    @ApiModelProperty(value = "主键")
    private Integer id;

    @ApiModelProperty(value = "渠道编号,PU开头代表public,CU开头代表custom")
    private String code;

    @ApiModelProperty(value = "渠道名称", required = true)
    private String name;

    @ApiModelProperty(value = "渠道分类id", required = true)
    private Integer categoryId;

    @ApiModelProperty(value = "全局属性 1: 全局默认 2:自定义属性")
    private Integer attr;

    @ApiModelProperty(value = "显示状态 0:不显示 1:显示")
    private Integer status;

    @ApiModelProperty(value = "多场景下是否展示")
    private String extraShow;

    @ApiModelProperty(value = "公司id", required = true)
    private Integer companyId;

    @ApiModelProperty(value = "指定覆盖默认的id")
    private Integer cover;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @ApiModelProperty(value = "投递来源")
    private String sourceName;

    @ApiModelProperty(value = "渠道分类名称")
    private String category;
}
