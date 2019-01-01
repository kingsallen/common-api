package com.moseeker.vo.talentpool.basic;/**
 * Created by zztaiwll on 18/11/27.
 */

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

/**
 * @version 1.0
 * @className TalentpoolHrAutomaticTagVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 18/11/27 下午5:06
 **/
@Data
@ApiModel(value = "hr自动标签的数据模型")
public class TalentpoolHrAutomaticTagVO {
    @ApiParam( name="id",value = "id")
    private Integer   id;

    @ApiModelProperty(value = "hr编号",example = "82752")
    private Integer hrId;

    @ApiModelProperty(value = "过滤项的名称",example = "测试标签添加name")
    private String name;

    @ApiModelProperty(value = "标签颜色",example = "#2CD6B1")
    private String color;

    @ApiModelProperty(value = "来源",example = "1")
    private String origins;

    @ApiModelProperty(value = "工作年限 存储的是code",example = "1")
    private String workYears;

    @ApiModelProperty(value = "现居住地",example = "阿坝,阿拉善盟,阿勒泰")
    private String cityName;

    @ApiModelProperty(value = "城市的code",example = "513200,652901,659002,152900")
    private String cityCode;

    @ApiModelProperty(value = "学历 传code",example = "1")
    private String degree;

    @ApiModelProperty(value = "曾经工作过的职位",example = "架构师")
    private String pastPosition;

    @ApiModelProperty(value = "是否只搜索最近一份工作 0否 1是",example = "1")
    private Integer inLastJobSearchPosition;

    @ApiModelProperty(value = "最小年龄",example = "20")
    private Integer minAge;

    @ApiModelProperty(value = "最大年龄",example = "30")
    private Integer maxAge;

    @ApiModelProperty(value = "期待工作地",example = "上海")
    private String intentionCityName;

    @ApiModelProperty(value = "期望城市的code",example = "1")
    private String intentionCityCode;

    @ApiModelProperty(value = "期待薪资",example = "1")
    private String intentionSalaryCode;

    @ApiModelProperty(value = "性别 1男，2女 0 不限",example = "1")
    private Integer sex;

    @ApiModelProperty(value = "是否只看内推 0否，1是",example = "0")
    private Integer isRecommend;

    @ApiModelProperty(value = "工作过的公司",example = "阿里巴巴")
    private String companyName;

    @ApiModelProperty(value = "是否只搜最近一个公司 0否，1是",example = "1")
    private Integer inLastJobSearchCompany;
    @ApiModelProperty(value = "创建时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;
    @ApiModelProperty(value = "更新时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;

    @ApiModelProperty(value = "1有效，0删除，2关闭",example = "1")
    private Integer disable;

    @ApiModelProperty(value = "关键词",example = "关键词1")
    private List<String> keywordList;

    @ApiModelProperty(value = "是否只用满足任一关键词词 0否，1是", dataType="java.lang.Integer",example = "1")
    private Byte containAnyKey;

}
