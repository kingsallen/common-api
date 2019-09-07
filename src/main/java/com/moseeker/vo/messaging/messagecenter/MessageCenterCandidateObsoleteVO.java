package com.moseeker.vo.messaging.messagecenter;

import com.moseeker.constant.messaging.MessageCenterNoticeType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * @author yehu
 * date 2019-09-07 14:15
 */
@Data
@Builder
@ApiModel(description = "消息中心-淘汰")
public class MessageCenterCandidateObsoleteVO implements IMessageCenterBaseVO {

    @ApiModelProperty("淘汰记录id")
    private Integer hrAtsObsoleteId;

    @Override
    public MessageCenterNoticeType getMessageCenterNoticeType() {
        return MessageCenterNoticeType.OTHER_FAILURE;
    }
}
