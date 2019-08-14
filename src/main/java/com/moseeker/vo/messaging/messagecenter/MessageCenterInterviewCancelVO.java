package com.moseeker.vo.messaging.messagecenter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author yehu
 */
@Data
@ApiModel(description = "消息中心-面试-取消面试")
public class MessageCenterInterviewCancelVO implements IMessageCenterBaseVO, Serializable {

    @ApiModelProperty(name = "hrInterviewConcreteId",value = "面试安排id",required = true)
    private Integer hrInterviewConcreteId;
}
