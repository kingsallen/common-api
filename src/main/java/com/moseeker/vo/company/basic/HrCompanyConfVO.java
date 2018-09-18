/*
 * This file is generated by jOOQ.
*/
package com.moseeker.vo.company.basic;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.sql.Timestamp;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * 公司级别的配置信息表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(description = "公司配置信息")
public class HrCompanyConfVO  {

    private static final long serialVersionUID = 149409684;

    private Integer   companyId;
    @ApiModelProperty(value = "config_sys_theme.id")
    private Integer   themeId;
    @ApiModelProperty(value = "全局每人每次红包活动可以获得的红包金额上限")
    private Integer   hbThrottle;
    @ApiModelProperty(value = "申请提交成功回复信息")
    private String    appReply;
    @ApiModelProperty(value = "创建时间")
    private Timestamp createTime;
    @ApiModelProperty(value = "更新时间")
    private Timestamp updateTime;
    @ApiModelProperty(value = "员工认证自定义文案")
    private String    employeeBinding;
    @ApiModelProperty(value = "推荐候选人自定义文案")
    private String    recommendPresentee;
    @ApiModelProperty(value = "推荐成功自定义文案")
    private String    recommendSuccess;
    @ApiModelProperty(value = "转发职位自定义文案")
    private String    forwardMessage;
    @ApiModelProperty(value = "一个人在一个公司下每月申请次数限制")
    private Short     applicationCountLimit;
    @ApiModelProperty(value = "一个人在一个公司下每月校招职位申请次数限制")
    private Short     schoolApplicationCountLimit;
    @ApiModelProperty(value = "职位自定义字段标题")
    private String    jobCustomTitle;
    @ApiModelProperty(value = "搜索页页面设置顺序,3#1#2")
    private String    searchSeq;
    @ApiModelProperty(value = "搜索页页面设置背景图")
    private String    searchImg;
    @ApiModelProperty(value = "自定义字段名称")
    private String    jobOccupation;
    @ApiModelProperty(value = "自定义部门别名")
    private String    teamnameCustom;
    @ApiModelProperty(value = "newjd_status即新的jd页的生效时间，")
    private Timestamp applicationTime;
    @ApiModelProperty(value = "新jd页去设置状态0是为开启，1是用户开启，2是审核通过（使用新jd），3撤销（返回基础版） 默认是0")
    private Integer   newjdStatus;
    @ApiModelProperty(value = "IM聊天开关，0：不开启，1：开启，2：开启+chatbot")
    private Byte      hrChat;
    @ApiModelProperty(value = "公司信息、团队信息、职位信息在仟寻展示，0: 否， 1: 是")
    private Byte      showInQx;
    @ApiModelProperty(value = "员工自定义称谓")
    private String    employeeSlug;
    @ApiModelProperty(value = "人才库状态表 0未开启，1开启普通人才库，2开启高端人才库")
    private Byte      talentpoolStatus;
    @ApiModelProperty(value = "51薪资面议开关 0：未开启，1：开启")
    private String    displayLocale;


}
