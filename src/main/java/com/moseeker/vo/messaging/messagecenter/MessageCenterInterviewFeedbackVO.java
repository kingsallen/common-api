package com.moseeker.vo.messaging.messagecenter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "消息中心-面试-面试反馈")
public class MessageCenterInterviewFeedbackVO extends AbstractMessageCenterBaseVO {

    @ApiModelProperty(name = "interviewFeedbackId",value = "面试反馈id",required = true)
    private Integer interviewFeedbackId;
}
