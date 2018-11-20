package com.moseeker.vo.application;

import lombok.Data;

import java.sql.Timestamp;

/**
 * Created by zztaiwll on 18/9/20.
 */
@Data
public class JobApplicationVO {
    private Integer   id;
    private Integer   wechatId;
    private Integer   positionId;
    private Integer   recommenderId;
    private Timestamp submitTime;
    private Integer   statusId;
    private Integer   lApplicationId;
    private Integer   reward;
    private Integer   sourceId;
    private Timestamp _CreateTime;
    private Integer   applierId;
    private Integer   interviewId;
    private String    resumeId;
    private Integer   atsStatus;
    private String    applierName;
    private Integer   disable;
    private Integer   routine;
    private Byte      isViewed;
    private Byte      notSuitable;
    private Integer   companyId;
    private Timestamp updateTime;
    private Integer   appTplId;
    private Byte      proxy;
    private Integer   applyType;
    private Integer   emailStatus;
    private Integer   viewCount;
    private Integer   recommenderUserId;
    private Integer   origin;
}
