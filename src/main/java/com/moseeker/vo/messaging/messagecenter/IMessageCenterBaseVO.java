package com.moseeker.vo.messaging.messagecenter;

import com.moseeker.constant.messaging.MessageCenterNoticeType;

import java.io.Serializable;

/**
 *   消息中心 mark interface
 */
public interface IMessageCenterBaseVO extends Serializable{
    MessageCenterNoticeType getMessageCenterNoticeType();

}
