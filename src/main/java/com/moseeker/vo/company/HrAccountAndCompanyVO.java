package com.moseeker.vo.company;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/5/15.
 */

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(description = "注册信息")
public class HrAccountAndCompanyVO {
    private String code;
    private Integer   id;
    private Integer   companyId;
    private String    mobile;
    private String    email;
    private Integer   wxuserId;
    private String    password;
    @ApiModelProperty(value = "Hr名称")
    private String    username;
    @ApiModelProperty(value = "0 超级账号；1：子账号; 2：普通账号")
    private Integer   accountType;
    @ApiModelProperty(value = "子账号邀请使用，账号是否激活，1：激活；0：未激活")
    private Byte      activation;
    private String registerTime;
    private String    registerIp;
    private String lastLoginTime;
    private String    lastLoginIp;
    private Integer   loginCount;
    @ApiModelProperty(value = "hr来源1:雇主 2:官网 3:微信扫描 4:我也要招人(聚合号) 5:我也要招人(企业号) 6:我也要招人(手机官网)")
    private Integer   source;
    @ApiModelProperty(value = "下载行业报告校验码")
    private String    downloadToken;
    @ApiModelProperty(value = "头像url")
    private String    headimgurl;
    @ApiModelProperty(value = "HR聊天是否托管给智能招聘助手，0 不托管，1 托管")
    private Byte      leaveToMobot;
    @ApiModelProperty(value = "公司添加来源 0:hr系统, 1:官网下载行业报告, 6:无线官网添加, 7:PC端 添加, 8:微信端添加, 9:PC导入, 10:微信端导入, 11 : 程序导入（和黄导入）")
    private Byte   companySource;
    private String    name;
    @ApiModelProperty(value = "公司区分(其它:2,免费用户:1,企业用户:0)")
    private Byte      type;
    @ApiModelProperty(value = "公司介绍")
    private String    introduction;
    @ApiModelProperty(value = "公司规模")
    private Byte      scale;
    private String    address;
    @ApiModelProperty(value = "公司性质 0:未填写 1:外商独资 3:国企 4:合资 5:民营公司 6:事业单位 7:上市公司 8:政府机关/非盈利机构 10:代表处 11:股份制企业 12:创业公司 13:其它")
    private Byte      property;
    private String    industry;
    @ApiModelProperty(value = "公司主页")
    private String    homepage;
    @ApiModelProperty(value = "公司logo的网络cdn地址")
    private String    logo;
    @ApiModelProperty(value = "公司简称")
    private String    abbreviation;
    @ApiModelProperty(value = "json格式的企业印象")
    private String    impression;
    @ApiModelProperty(value = "json格式的企业banner")
    private String    banner;
    private Integer   parentId;
    private Integer   hraccountId;
    @ApiModelProperty(value = "公司口号")
    private String    slogan;
    private String    feature;
    @ApiModelProperty(value = "是否世界500强，0：不是 1：是")
    private Byte      fortune;


}
