package com.moseeker.vo.application.ats;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class ApplicationArchiveParamsVO {
    @ApiModelProperty(name = "hrId", value = "hrId", dataType = "int")
    private Integer hrId;
    @ApiModelProperty(name = "applicationId", value = "职位id", dataType = "int")
    private Integer applicationId;
    @ApiModelProperty(name = "archiveType", value = "归档类型 1:已入职 2:放弃入职 3:淘汰", dataType = "int")
    private Integer archiveType;
    @ApiModelProperty(name = "archiveReasonCode", value = "归档原因编号", dataType = "int")
    private Integer archiveReasonCode;
    @ApiModelProperty(name = "archiveReason", value = "归档原因")
    private String archiveReason;
}
