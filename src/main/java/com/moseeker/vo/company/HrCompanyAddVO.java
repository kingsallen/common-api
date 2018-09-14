package com.moseeker.vo.company;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
    private String    username;
    private Byte      source;
    private String    name;
    private Byte      type;
    private String    introduction;
    private Byte      scale;
    private String    address;
    private Byte      property;
    private String    industry;
    private String    homepage;
    private String    logo;
    private String    abbreviation;
    private String    impression;
    private String    banner;
    private Integer   parentId;
    private Integer   hraccountId;
    private String    slogan;
    private String    feature;
    private Byte      fortune;
    @ApiModelProperty(value = "关联的hr编号列表")
    private List<Integer> hrs;

}
