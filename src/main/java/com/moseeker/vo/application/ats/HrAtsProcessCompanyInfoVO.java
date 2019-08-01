package com.moseeker.vo.application.ats;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("流程的信息模型")
public class HrAtsProcessCompanyInfoVO extends HrAtsProcessCompanyVO {
    @ApiModelProperty(name="positionNum",value = "职位数量")
    private int positionNum;
    @ApiModelProperty(name="stageNum",value = "阶段数量")
    private int stageNum;
}
