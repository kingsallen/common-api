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
@ApiModel(description = "消息中心-推荐-hr推荐")
public class MessageCenterRecommandByHrVO implements IMessageCenterBaseVO{

    @ApiModelProperty(name = "hrId",value = "hrId",required = true)
    private Integer hrId;

    @ApiModelProperty(name = "applicationId",value = "申请id",required = true)
    private Integer applicationId;

    @Override
    public MessageCenterNoticeType getMessageCenterNoticeType() {
        return MessageCenterNoticeType.RECOMMAND_BY_HR;
    }
}
