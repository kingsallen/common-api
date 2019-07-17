package com.moseeker.vo.messaging.messagecenter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "消息中心-推荐-猎头推荐")
public class MessageCenterRecommandByHeadhunterVO extends AbstractMessageCenterBaseVO {

    @ApiModelProperty(name = "headhunterId",value = "猎头id",required = true)
    private Integer headhunterId;

    @ApiModelProperty(name = "positionId",value = "职位id",required = true)
    private Integer positionId;

    @ApiModelProperty(name = "candidateId",value = "候选人id",required = true)
    private Integer candidateId;
}
