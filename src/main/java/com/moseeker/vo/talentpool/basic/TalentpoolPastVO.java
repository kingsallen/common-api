/*
 * This file is generated by jOOQ.
*/
package com.moseeker.vo.talentpool.basic;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * 人才库使用的曾任职务和曾任公司
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(description = "人才库使用的曾任职务和曾任公司")
public class TalentpoolPastVO {

    private Integer id;
    private Integer companyId;
    @ApiModelProperty(value = "公司名称")
    private String  name;
    @ApiModelProperty(value = "0 自定义职位 1自定义公司")
    private Integer type;
    @ApiModelProperty(value = "0 企业标签 1是简历筛选规则")
    private Integer flag;
}
