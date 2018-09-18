package com.moseeker.vo.company;

import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/6/1.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HrTeamInfoVO {

    private Integer teamNum;
    private Integer hasPic;
    private List<HrTeamPositionDetailVO> teamPosition;

}
