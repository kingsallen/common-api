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
@ApiModel(description = "消息中心-面试-面试反馈")
public class MessageCenterInterviewFeedbackVO implements IMessageCenterBaseVO{

    @ApiModelProperty(name = "interviewFeedbackId",value = "面试反馈id",required = true)
    private Integer interviewFeedbackId;

    @Override
    public MessageCenterNoticeType getMessageCenterNoticeType() {
        return MessageCenterNoticeType.INTERVIEW_FEEDBACK;
    }
}
