package com.moseeker.vo.position.basic;

import lombok.Data;

@Data
public class JobPositionCcmailVO {

    private int   id;
    private int   positionId;
    private String    toEmail;
    private int   hrId;
    private String createTime;
    private String updateTime;

}
