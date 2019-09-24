package com.moseeker.vo.company.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("请求猎头的接口参数")
public class HrHunterParamsVO {
    @ApiModelProperty(name="companyId",value = "职位所在公司")
    private int companyId;
    @ApiModelProperty(name="hrId",value = "职位发布人")
    private int hrId;
    @ApiModelProperty(name="positionId",value = "职位编号")
    private int positionId;
    @ApiModelProperty(name="userId",value = "候选人id")
    private int userId;
}
