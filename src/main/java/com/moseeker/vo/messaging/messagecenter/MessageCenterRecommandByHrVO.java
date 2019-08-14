package com.moseeker.vo.messaging.messagecenter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author yehu
 */
@Data
@ApiModel(description = "消息中心-推荐-hr推荐")
public class MessageCenterRecommandByHrVO implements IMessageCenterBaseVO, Serializable {

    @ApiModelProperty(name = "hrId",value = "hrid",required = true)
    private Integer hrId;

    @ApiModelProperty(name = "positionId",value = "职位id",required = true)
    private Integer positionId;

    @ApiModelProperty(name = "candidateId",value = "候选人id",required = true)
    private Integer candidateId;
}
