package com.moseeker.vo.useremployee;/**
 * Created by zztaiwll on 18/12/11.
 */

import lombok.Data;

import java.sql.Timestamp;

/**
 * @version 1.0
 * @className UserEmployeePointsRecordVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 18/12/11 下午2:32
 **/
@Data
public class UserEmployeePointsRecordVO {
    private Integer   id;
    private Long      employeeId;
    private String    reason;
    private Integer   award;
    private Timestamp _CreateTime;
    private Long      applicationId;
    private Long      recomWxuser;
    private Timestamp updateTime;
    private Long      positionId;
    private Long      berecomWxuserId;
    private Long      awardConfigId;
    private Integer   recomUserId;
    private Integer   berecomUserId;
}
