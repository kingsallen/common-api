package com.moseeker.vo.application;

import lombok.Data;

@Data
public class HrDataApplicationEsVO {
    private int appId;
    private int userId;
    private int isViewed;
    private int lastOperatorId;
    private int appTplId;
    private int parentProcessId;
}
