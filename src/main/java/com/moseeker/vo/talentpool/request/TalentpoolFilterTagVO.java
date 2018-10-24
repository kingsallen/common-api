package com.moseeker.vo.talentpool.request;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by moseeker on 2018/9/28.
 */
@Data
public class TalentpoolFilterTagVO {
    @ApiParam( name="id",value = "id")
    private Integer   id;

    @ApiModelProperty(value = "公司编号")
    @ApiParam( name="companyId",value = "公司编号",defaultValue = "4")
    private Integer companyId;

    @ApiModelProperty(value = "过滤项的名称")
    @ApiParam(value = "过滤项的名称",defaultValue = "过滤项的名称")
    private String name;

    @ApiModelProperty(value = "标签颜色")
    @ApiParam(name="color",value = "标签颜色" ,defaultValue = "red")
    private String color;

    @ApiModelProperty(value = "来源")
    @ApiParam(name="origins",value = "来源" ,defaultValue = "1")
    private String origins;

    @ApiModelProperty(value = "工作年限 存储的是code")
    @ApiParam(name="workYears",value = "工作年限 存储的是code" ,defaultValue = "1")
    private String workYears;

    @ApiModelProperty(value = "现居住地")
    @ApiParam(name="cityName",value = "现居住地" ,defaultValue = "上海")
    private String cityName;

    @ApiModelProperty(value = "城市的code")
    @ApiParam(name="cityCode",value = "城市的code" ,defaultValue = "1")
    private String cityCode;

    @ApiModelProperty(value = "学历 传code")
    @ApiParam(name="degree",value = "学历 传code" ,defaultValue = "1")
    private String degree;

    @ApiModelProperty(value = "曾经工作过的职位")
    @ApiParam(name="pastPosition",value = "曾经工作过的职位" ,defaultValue = "架构师")
    private String pastPosition;

    @ApiModelProperty(value = "是否只搜索最近一份工作 0否 1是")
    @ApiParam(name="inLastJobSearchPosition",value = "是否只搜索最近一份工作" ,defaultValue = "1")
    private Integer inLastJobSearchPosition;

    @ApiModelProperty(value = "最小年龄")
    @ApiParam(name="minAge",value = "最小年龄" ,defaultValue = "20")
    private Integer minAge;

    @ApiModelProperty(value = "最大年龄")
    @ApiParam(name="maxAge",value = "最大年龄" ,defaultValue = "30")
    private Integer maxAge;

    @ApiModelProperty(value = "期待工作地")
    @ApiParam(name="intentionCityName",value = "期待工作地" ,defaultValue = "上海")
    private String intentionCityName;

    @ApiModelProperty(value = "期望城市的code")
    @ApiParam(name="intentionCityCode",value = "期望城市的code" ,defaultValue = "1")
    private String intentionCityCode;

    @ApiModelProperty(value = "期待薪资")
    @ApiParam(name="intentionSalaryCode",value = "期待薪资" ,defaultValue = "1")
    private String intentionSalaryCode;

    @ApiModelProperty(value = "性别 1男，2女 0 不限")
    @ApiParam(name="sex",value = "性别 1男，2女 0 不限" ,defaultValue = "1")
    private Integer sex;

    @ApiModelProperty(value = "是否只看内推 0否，1是")
    @ApiParam(name="isRecommend",value = "是否只看内推 0否，1是" ,defaultValue = "0")
    private Integer isRecommend;

    @ApiModelProperty(value = "工作过的公司")
    @ApiParam(name="companyName",value = "工作过的公司" ,defaultValue = "阿里巴巴")
    private String companyName;

    @ApiModelProperty(value = "是否只搜最近一个公司 0否，1是")
    @ApiParam(name="inLastJobSearchCompany",value = "是否只搜最近一个公司 0否，1是" ,defaultValue = "1")
    private Integer inLastJobSearchCompany;

    private Timestamp createTime;
    private Timestamp updateTime;

    @ApiModelProperty(value = "1有效，0删除，2关闭")
    @ApiParam(name="disable",value = "1有效，0删除，2关闭" ,defaultValue = "1")
    private Integer disable;

    @ApiModelProperty(value = "关键词")
    @ApiParam(name="keywordList",value = "关键词" ,defaultValue = "关键词1")
    private List<String> keywordList;

    @ApiModelProperty(value = "是否只用满足任一关键词词 0否，1是")
    @ApiParam(name="containAnyKey",value = "是否只用满足任一关键词词 0否，1是" ,defaultValue = "1")
    private Byte containAnyKey;

}

