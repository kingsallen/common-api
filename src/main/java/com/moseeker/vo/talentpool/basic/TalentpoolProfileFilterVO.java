/*
 * This file is generated by jOOQ.
*/
package com.moseeker.vo.talentpool.basic;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.sql.Timestamp;


/**
 * 简历筛选表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(description = "简历筛选表")
public class TalentpoolProfileFilterVO {

    private Integer   id;
    private Integer   companyId;
    @ApiModelProperty(value = "标签的名称")
    private String    name;
    @ApiModelProperty(value = "来源")
    private String    origins;
    @ApiModelProperty(value = "工作年限 存储的是code")
    private String    workYears;
    @ApiModelProperty(value = "现居住地")
    private String    cityName;
    @ApiModelProperty(value = "城市的code")
    private String    cityCode;
    @ApiModelProperty(value = "学历 传code")
    private String    degree;
    @ApiModelProperty(value = "曾经工作过的职位")
    private String    pastPosition;
    @ApiModelProperty(value = "是否只搜索最近一份工作 0否 1是")
    private Integer   inLastJobSearchPosition;
    @ApiModelProperty(value = "最小年龄")
    private Integer   minAge;
    @ApiModelProperty(value = "最大年龄")
    private Integer   maxAge;
    @ApiModelProperty(value = "期待工作地")
    private String    intentionCityName;
    @ApiModelProperty(value = "期望城市的code")
    private String    intentionCityCode;
    @ApiModelProperty(value = "期待薪资")
    private String    intentionSalaryCode;
    @ApiModelProperty(value = "性别 0男，1女 2不限")
    private Integer   sex;
    @ApiModelProperty(value = "是否只看内推 0否，1是")
    private Integer   isRecommend;
    @ApiModelProperty(value = "工作过的公司")
    private String    companyName;
    @ApiModelProperty(value = "是否只搜最近一个公司 0否，1是")
    private Integer   inLastJobSearchCompany;
    @ApiModelProperty(value = "创建时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;
    @ApiModelProperty(value = "1有效，0无效，2关闭")
    private Integer   disable;
    @ApiModelProperty(value = "更新时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;

}