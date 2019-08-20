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
@ApiModel(description = "消息中心-推荐-hr推荐")
public class MessageCenterRecommandByHrVO implements IMessageCenterBaseVO, Serializable {

    @ApiModelProperty(name = "hrId",value = "hrid",required = true)
    private Integer hrId;

    @ApiModelProperty(name = "applicationId",value = "申请id",required = true)
    private Integer applicationId;

    @Override
    public MessageCenterNoticeType getMessageCenterNoticeType() {
        return MessageCenterNoticeType.RECOMMAND_BY_HR;
    }
}
