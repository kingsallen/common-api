package com.moseeker.vo.company;

import com.moseeker.vo.company.basic.HrCompanyVO;
import java.util.List;
import java.util.Set;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/6/1.
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class CompanyDetailVO {
    private HrCompanyVO company;
    private Integer newJD;
    private Integer teamNum;
    private Integer hasPic;
    private List<HrTeamPositionDetailVO> teamPosition;
    private Set<String> positionCity;

    public HrCompanyVO getCompany() {
        return company;
    }

    public void setCompany(HrCompanyVO company) {
        this.company = company;
    }

    public Integer getNewJD() {
        return newJD;
    }

    public void setNewJD(Integer newJD) {
        this.newJD = newJD;
    }

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

    public Set<String> getPositionCity() {
        return positionCity;
    }

    public void setPositionCity(Set<String> positionCity) {
        this.positionCity = positionCity;
    }
}
