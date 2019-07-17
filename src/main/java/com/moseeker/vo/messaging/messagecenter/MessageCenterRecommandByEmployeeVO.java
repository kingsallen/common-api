package com.moseeker.vo.messaging.messagecenter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "消息中心-推荐-内推投递")
public class MessageCenterRecommandByEmployeeVO extends AbstractMessageCenterBaseVO {

    @ApiModelProperty(name = "positionId",value = "职位id",required = true)
    private Integer positionId;

    @ApiModelProperty(name = "employeeId",value = "员工id",required = true)
    private Integer employeeId;

    @ApiModelProperty(name = "candidateId",value = "候选人id",required = true)
    private Integer candidateId;
}
