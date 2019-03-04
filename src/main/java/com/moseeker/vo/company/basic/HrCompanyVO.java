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
 * 公司表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(description = "公司信息")
public class HrCompanyVO {

    private Integer   id;
    @ApiModelProperty(value = " 企业用户:0 ,免费用户:1 , 其它:2")
    private Byte      type;
    @ApiModelProperty(value = "公司注册名称")
    private String    name;
    @ApiModelProperty(value = "公司介绍")
    private String    introduction;
    @ApiModelProperty(value = "公司规模")
    private Byte      scale;
    @ApiModelProperty(value = "公司地址")
    private String    address;
    @ApiModelProperty(value = "公司性质 0:未填写 1:外商独资 3:国企 4:合资 5:民营公司 6:事业单位 7:上市公司 8:政府机关/非盈利机构 10:代表处 11:股份制企业 12:创业公司 13:其它")
    private Byte      property;
    @ApiModelProperty(value = "所属行业")
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
    @ApiModelProperty(value = "上级公司")
    private Integer   parentId;
    @ApiModelProperty(value = "公司联系人, hr_account.id")
    private Integer   hraccountId;
    @ApiModelProperty(value = "0:无效 1:有效, 删除子公司使用， 母公司目前没有禁用功能")
    private Byte      disable;
    @ApiModelProperty(value = "创建时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;
    @ApiModelProperty(value = "更新时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;
    @ApiModelProperty(value = "添加来源 0:hr系统, 1:官网下载行业报告, 6:无线官网添加, 7:PC端 添加, 8:微信端添加, 9:PC导入, 10:微信端导入, 11 : 程序导入（和黄导入）")
    private Byte      source;
    @ApiModelProperty(value = "公司口号")
    private String    slogan;
    @ApiModelProperty(value = "是否世界500强，0：不是 1：是")
    private Byte      fortune;
    @ApiModelProperty(value = "公司福利特色， 由公司下的职位的福利特色每天跑脚本合并而来，目前供支付宝使用")
    private String    feature;
    @ApiModelProperty(value = "公司员工数量")
    private Integer employeeNumber;


}
