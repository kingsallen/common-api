package com.moseeker.vo.application;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp submitTime;
    private Integer   statusId;
    private Integer   lApplicationId;
    private Integer   reward;
    private Integer   sourceId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;
    private Integer   appTplId;
    private Byte      proxy;
    private Integer   applyType;
    private Integer   emailStatus;
    private Integer   viewCount;
    private Integer   recommenderUserId;
    private Integer   origin;
}
