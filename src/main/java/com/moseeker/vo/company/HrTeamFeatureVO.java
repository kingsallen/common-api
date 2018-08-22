package com.moseeker.vo.company;


import com.moseeker.vo.company.basic.HrTeamVO;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/3/13.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HrTeamFeatureVO {
    private HrTeamVO hrTeam;
    private String  resType;
    private String teamImageLink;
    private List<HrTeamMemberFeatureVO> memberList;

    public HrTeamVO getHrTeam() {
        return hrTeam;
    }

    public void setHrTeam(HrTeamVO hrTeam) {
        this.hrTeam = hrTeam;
    }

    public String getTeamImageLink() {
        return teamImageLink;
    }

    public void setTeamImageLink(String teamImageLink) {
        this.teamImageLink = teamImageLink;
    }

    public List<HrTeamMemberFeatureVO> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<HrTeamMemberFeatureVO> memberList) {
        this.memberList = memberList;
    }

    public String getResType() {
        return resType;
    }

    public void setResType(String resType) {
        this.resType = resType;
    }
}
