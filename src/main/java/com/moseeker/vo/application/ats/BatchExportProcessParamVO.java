package com.moseeker.vo.application.ats;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * BatchExportProcessParamVO
 *
 * @Author: lee
 * @Date: 2019/7/12
 */
@Data
public class BatchExportProcessParamVO {
    @ApiModelProperty(name = "hrId", value = "hr编号", dataType = "int", required = true, example = "82752")
    private Integer hrId;
    @ApiModelProperty(name = "positionId", value = "职位Id", dataType = "int", example = "1")
    private Integer positionId;
    @ApiModelProperty(name = "processId", value = "流程阶段id", dataType = "int", example = "2")
    private Integer processId;
    @ApiModelProperty(name = "startTime", value = "开始时间", dataType = "java.lang.String", required = true, example = "2019-07-01")
    private String startTime;
    @ApiModelProperty(name = "endTime", value = "结束时间", dataType = "java.lang.String", required = true, example = "2019-07-10")
    private String endTime;
}
