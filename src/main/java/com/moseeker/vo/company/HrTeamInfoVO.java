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

    public Integer getTeamNum() {
        return teamNum;
    }

    public void setTeamNum(Integer teamNum) {
        this.teamNum = teamNum;
    }

    public Integer getHasPic() {
        return hasPic;
    }

    public void setHasPic(Integer hasPic) {
        this.hasPic = hasPic;
    }

    public List<HrTeamPositionDetailVO> getTeamPosition() {
        return teamPosition;
    }

    public void setTeamPosition(List<HrTeamPositionDetailVO> teamPosition) {
        this.teamPosition = teamPosition;
    }
}
