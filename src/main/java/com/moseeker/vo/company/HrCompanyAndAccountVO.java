package com.moseeker.vo.company;

import java.sql.Timestamp;
import java.util.List;

import com.moseeker.vo.company.basic.UserHrAccountVO;

import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * Created by moseeker on 2018/6/1.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HrCompanyAndAccountVO {
	
    private Integer   id;
    private Byte      type;
    private String    name;
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
    private Byte      disable;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Byte      source;
    private String    slogan;
    private String    feature;
    private Byte      fortune;
    private List<UserHrAccountVO> hrs;

}
