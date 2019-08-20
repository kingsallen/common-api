package com.moseeker.vo.messaging.messagecenter;

import com.moseeker.constant.messaging.MessageCenterNoticeType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author yehu
 */
@Data
@Builder
@ApiModel(description = "消息中心-面试-安排面试")
public class MessageCenterInterviewAssignVO implements IMessageCenterBaseVO{

    @ApiModelProperty(name = "hrInterviewConcreteId",value = "面试安排id",required = true)
    private Integer hrInterviewConcreteId;

    @Override
    public MessageCenterNoticeType getMessageCenterNoticeType() {
        return MessageCenterNoticeType.INTERVIEW_ASSIGN;
    }
}
