package com.moseeker.vo.messaging;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Map;

@Data
@Component
@Scope("prototype")
public class NewMessageNoticeParamVO {

    private Integer messageId;

    private String receiverName;

    private String receiverEmail;

    private String receiverMobile;

    private Integer receiverCompanyId;

    private String openId;

    private Integer wechatId;

    private boolean isQRcode;

    private Map<String,Object> originParam;

}