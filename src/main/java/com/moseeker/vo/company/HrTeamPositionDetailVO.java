package com.moseeker.vo.company;


import com.moseeker.vo.company.basic.HrResourceVO;
import com.moseeker.vo.company.basic.HrTeamVO;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/6/1.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HrTeamPositionDetailVO {
    private HrTeamVO team;
    private HrResourceVO teamPic;
    private int positionNum;
    private List<HrTeamMemberResourceVO> teamMember;

    public HrTeamVO getTeam() {
        return team;
    }

    public void setTeam(HrTeamVO team) {
        this.team = team;
    }

    public HrResourceVO getTeamPic() {
        return teamPic;
    }

    public void setTeamPic(HrResourceVO teamPic) {
        this.teamPic = teamPic;
    }

    public int getPositionNum() {
        return positionNum;
    }

    public void setPositionNum(int positionNum) {
        this.positionNum = positionNum;
    }

    public List<HrTeamMemberResourceVO> getTeamMember() {
        return teamMember;
    }

    public void setTeamMember(List<HrTeamMemberResourceVO> teamMember) {
        this.teamMember = teamMember;
    }
}
