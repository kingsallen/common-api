package com.moseeker.vo.messaging.messagecenter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author yehu
 */
@Data
@ApiModel(description = "消息中心-面试-面试反馈")
public class MessageCenterInterviewFeedbackVO implements IMessageCenterBaseVO, Serializable {

    @ApiModelProperty(name = "interviewFeedbackId",value = "面试反馈id",required = true)
    private Integer interviewFeedbackId;
}
