package com.moseeker.vo.company;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/6/1.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(description = "公司信息")
public class HrCompanyAddVO {
    private String code;
    private Integer   id;
    @ApiModelProperty(value = "hr名称")
    private String    username;
    @ApiModelProperty(value = "公司添加来源 0:hr系统, 1:官网下载行业报告, 6:无线官网添加, 7:PC端 添加, 8:微信端添加, 9:PC导入, 10:微信端导入, 11 : 程序导入（和黄导入）")
    private Byte      source;
    private String    name;
    private Byte      type;
    @ApiModelProperty(value = "公司介绍")
    private String    introduction;
    private Byte      scale;
    private String    address;
    @ApiModelProperty(value = "公司性质 0:未填写 1:外商独资 3:国企 4:合资 5:民营公司 6:事业单位 7:上市公司 8:政府机关/非盈利机构 10:代表处 11:股份制企业 12:创业公司 13:其它")
    private Byte      property;
    private String    industry;
    private String    homepage;
    @ApiModelProperty(value = "公司logo的网络cdn地址")
    private String    logo;
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
    @ApiModelProperty(value = "关联的hr编号列表")
    private List<Integer> hrs;

}
