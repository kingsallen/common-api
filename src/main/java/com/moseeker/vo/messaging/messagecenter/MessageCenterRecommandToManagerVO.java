package com.moseeker.vo.messaging.messagecenter;

import com.moseeker.constant.messaging.MessageCenterNoticeType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * @author yehu
 * date 2019-08-21 18:17
 */
@Data
@Builder
@ApiModel(description = "消息中心-推荐到用人部门")
public class MessageCenterRecommandToManagerVO implements IMessageCenterBaseVO{

    @ApiModelProperty(name = "hrId",value = "hrId",required = true)
    private Integer hrId;

    @ApiModelProperty(name = "applicationId",value = "申请id",required = true)
    private Integer applicationId;

    @ApiModelProperty(name="managerId",value = "用人部门id",required = true)
    private Integer managerId;

    @Override
    public MessageCenterNoticeType getMessageCenterNoticeType() {
        return MessageCenterNoticeType.RECOMMAND_TO_MANAGER;
    }
}
