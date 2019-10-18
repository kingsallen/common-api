package com.moseeker.vo.application;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel("申请分页数据请求")
public class ApplicationPageRequestVo {

    private Integer companyId;

    private Integer hrId;

    private Integer positionId;

    private Integer processId;

    private Integer phaseId;

    private Integer atsStatus;

    private String applyStartTime;

    private String applyEndTime;

    private Integer pageSize;

    private Integer pageNum;
}
