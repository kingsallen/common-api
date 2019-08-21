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
@ApiModel(description = "消息中心-面试-取消面试")
public class MessageCenterInterviewCancelVO implements IMessageCenterBaseVO{

    @ApiModelProperty(name = "hrInterviewConcreteId",value = "面试安排id",required = true)
    private Integer hrInterviewConcreteId;

    @Override
    public MessageCenterNoticeType getMessageCenterNoticeType() {
        return MessageCenterNoticeType.INTERVIEW_CANCEL;
    }
}
