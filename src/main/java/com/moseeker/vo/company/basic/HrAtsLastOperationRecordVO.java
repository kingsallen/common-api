package com.moseeker.vo.company.basic;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class HrAtsLastOperationRecordVO {
    private Integer   id;
    private Integer   appId;
    private Timestamp optTime;
    private Integer   lastAppTplId;
}
