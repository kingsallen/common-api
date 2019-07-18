package com.moseeker.vo.messaging.messagecenter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "消息中心-面试-取消面试")
public class MessageCenterInterviewCancelVO extends AbstractMessageCenterBaseVO {

    @ApiModelProperty(name = "hrInterviewConcreteId",value = "面试安排id",required = true)
    private Integer hrInterviewConcreteId;
}
