package com.moseeker.vo.application.ats;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("流程下阶段的详情")
public class HrAtsPhaseInfoVO {
    @ApiModelProperty(name="phaseId",value = "阶段id")
    private int phaseId;
    @ApiModelProperty(name="phaseName",value = "阶段名称")
    private String phaseName;
    @ApiModelProperty(name="order",value = "阶段顺序")
    private int order;
    @ApiModelProperty(name="baseItemId",value = "配置的阶段id")
    private int baseItemId;
    @ApiModelProperty(name="baseId",value = "基础类型的id")
    private int baseId;
    @ApiModelProperty(name="baseType",value = "基础类型的type")
    private int baseType;
}
