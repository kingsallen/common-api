package com.moseeker.vo.messaging.messagecenter;

import com.moseeker.constant.messaging.MessageCenterNoticeType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;


/**
 * @author yehu
 */
@Data
@Builder
@ApiModel(description = "消息中心-推荐-猎头推荐")
public class MessageCenterRecommandByHeadhunterVO implements IMessageCenterBaseVO{

    @ApiModelProperty(name = "headhunterCandidateId",value = "猎头候选人id",required = true)
    private Integer headhunterCandidateId;

    @Override
    public MessageCenterNoticeType getMessageCenterNoticeType() {
        return MessageCenterNoticeType.RECOMMAND_BY_HEADHUNTER;
    }
}
