/*
 * This file is generated by jOOQ.
*/
package com.moseeker.vo.company.basic;


import java.sql.Timestamp;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * 候选人列表常用筛选项
 */
@Data
@EqualsAndHashCode
public class HrSearchConditionVO   {

    private static final long serialVersionUID = -1291749181;

    private Integer   id;
    private String    name;
    private String    publisher;
    private String    positionId;
    private String    keyword;
    private String    submitTime;
    private String    workYears;
    private String    cityName;
    private String    degree;
    private String    pastPosition;
    private Integer   inLastJobSearchPosition;
    private Integer   minAge;
    private Integer   maxAge;
    private String    intentionCityName;
    private Integer   sex;
    private String    intentionSalaryCode;
    private String    companyName;
    private Integer   inLastJobSearchCompany;
    private Integer   hrAccountId;
    private Timestamp createTime;
    private Integer   updateTime;
    private Integer   type;
    private Byte      candidateSource;
    private String    favoriteHrs;
    private Byte      isFreshGraduates;
    private Byte      isPublic;
    private Byte      isRecommend;
    private String    origins;
    private String    tagIds;

}
