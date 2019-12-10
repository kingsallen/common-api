package com.moseeker.vo.application;

import com.moseeker.vo.referral.basic.UserEmployeeVO;
import com.moseeker.vo.user.basic.UserUserVO;
import lombok.Data;

@Data
public class ApplicationAtsInfoDataVO {

    private Integer id;

    private Integer positionId;

    private String jobnumber;

    private Integer applierId;

    private Integer phaseId;

    private Integer processId;

    private Integer lApplicationId;

    private Integer appTplId;

    private Integer recommenderUserId;

    private Integer atsStatus;

    private UserUserVO recommenderUserUser;

    private UserEmployeeVO recommenderUserEmployee;
}
