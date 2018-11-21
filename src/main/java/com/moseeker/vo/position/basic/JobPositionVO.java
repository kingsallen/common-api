package com.moseeker.vo.position.basic;

import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * Created by moseeker on 2018/8/22.
 */
@Data
public class JobPositionVO {
    private Integer   id;
    private String    jobnumber;
    private Integer   companyId;
    private String    title;
    private String    province;
    private String    city;
    private String    department;
    private Integer   lJobid;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp publishDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp stopDate;
    private String    accountabilities;
    private String    experience;
    private String    requirement;
    private String    salary;
    private String    language;
    private Integer   jobGrade;
    private Byte      status;
    private Integer   visitnum;
    private String    lastvisit;
    private Integer   sourceId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;
    private String    businessGroup;
    private Byte      employmentType;
    private String    hrEmail;
    private String    benefits;
    private Byte      degree;
    private List<String> featureList;
    private Byte      emailNotice;
    private Byte      candidateSource;
    private String    occupation;
    private Integer   isRecom;
    private String    industry;
    private Integer   hongbaoConfigId;
    private Integer   hongbaoConfigRecomId;
    private Integer   hongbaoConfigAppId;
    private Byte      emailResumeConf;
    private Integer   lPostingtargetid;
    private Byte      priority;
    private Integer   shareTplId;
    private String    district;
    private Short     count;
    private Integer   salaryTop;
    private Integer   salaryBottom;
    private Byte      experienceAbove;
    private Byte      degreeAbove;
    private Byte      managementExperience;
    private Byte      gender;
    private Integer   publisher;
    private Integer   appCvConfigId;
    private Short     source;
    private Byte      hbStatus;
    private Integer   childCompanyId;
    private Byte      age;
    private String    majorRequired;
    private String    workAddress;
    private String    keyword;
    private String    reportingTo;
    private Byte      isHiring;
    private Byte      underlings;
    private Byte      languageRequired;
    private Byte      targetIndustry;
    private Byte      currentStatus;
    private Integer   positionCode;
    private Integer   teamId;
    private Byte      profileCcMailEnabled;

}
