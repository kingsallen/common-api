package com.moseeker.vo.messaging.messagecenter;

import com.moseeker.constant.messaging.MessageCenterNoticeType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.util.Objects;

/**
 * @author yehu
 * date 2019-09-03 10:17
 */
@Data
@Builder
@ApiModel(description = "消息中心-面试-候选人未参面")
public class MessageCenterInterviewCandidateNotComeVO implements IMessageCenterBaseVO{

    @ApiModelProperty("面试id")
    private Integer hrCompanyInterviewId;

    @Override
    public MessageCenterNoticeType getMessageCenterNoticeType() {
        return MessageCenterNoticeType.CANDIDATE_NOT_COME;
    }
}
