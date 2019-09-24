package com.moseeker.vo.application.ats;

import lombok.Data;

@Data
public class HrApplicationEsVO {
    private HrAtsPhaseBaseItemVO base;
    private int phaseId;
    private int isViewed;
}
