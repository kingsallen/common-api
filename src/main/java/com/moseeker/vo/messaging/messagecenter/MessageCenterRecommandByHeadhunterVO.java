package com.moseeker.vo.messaging.messagecenter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author yehu
 */
@Data
@ApiModel(description = "消息中心-推荐-猎头推荐")
public class MessageCenterRecommandByHeadhunterVO implements IMessageCenterBaseVO, Serializable {

    @ApiModelProperty(name = "headhunterCandidateId",value = "猎头候选人id",required = true)
    private Integer headhunterCandidateId;

}
