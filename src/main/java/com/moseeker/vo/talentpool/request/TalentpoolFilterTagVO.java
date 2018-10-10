package com.moseeker.vo.talentpool.request;

import io.swagger.annotations.ApiModelProperty;
import java.sql.Timestamp;
import java.util.List;
import lombok.Data;

/**
 * Created by moseeker on 2018/9/28.
 */
@Data
public class TalentpoolFilterTagVO {

    private Integer   id;
    private Integer   companyId;
    @ApiModelProperty(value = "过滤项的名称")
    private String    name;
    @ApiModelProperty(value = "标签颜色")
    private String    color;
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
    @ApiModelProperty(value = "性别 1男，2女 0 不限")
    private Integer   sex;
    @ApiModelProperty(value = "是否只看内推 0否，1是")
    private Integer   isRecommend;
    @ApiModelProperty(value = "工作过的公司")
    private String    companyName;
    @ApiModelProperty(value = "是否只搜最近一个公司 0否，1是")
    private Integer   inLastJobSearchCompany;
    private Timestamp createTime;
    private Timestamp updateTime;
    @ApiModelProperty(value = "1有效，0删除，2关闭")
    private Integer   disable;
    @ApiModelProperty(value = "关键词")
    private List<String> keywordList;
    @ApiModelProperty(value = "是否只用满足任一关键词词 0否，1是")
    private Byte      containAnyKey;
}
