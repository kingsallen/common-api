package com.moseeker.vo.jobboard;

import lombok.Data;

import java.util.List;

@Data
public class LastestSyncInfoVO {

    private int positionId;

    private List<HrThirdPartyPositionVO> syncInfo;

}
