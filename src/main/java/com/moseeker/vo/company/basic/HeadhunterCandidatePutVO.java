package com.moseeker.vo.company.basic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("猎头候选人更新VO")
public class HeadhunterCandidatePutVO {

    @ApiModelProperty(value = "候选人状态")
    private Integer status;
    @ApiModelProperty(value = "候选人ID")
    private Integer id;
    @ApiModelProperty(value = "猎头费用")
    private Double cost;
    @ApiModelProperty(value = "候选人userId")
    private Integer userId;
    @ApiModelProperty(value = "职位id")
    private Integer positionId;
}
