package com.moseeker.vo.referral.basic;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class UserReferralRecordVO {

    private Integer   id;
    private Integer   userId;
    private Integer   referenceId;
    private Integer   companyId;
    private String createTime;
    private String updateTime;
    private Byte      scene;

}
