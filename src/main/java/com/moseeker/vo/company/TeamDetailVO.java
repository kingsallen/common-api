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
public class TeamDetailVO {

    private HrCompanyVO company;
    private Integer newJD;
    private HrTeamPositionDetailVO teamInfo;
    private List<HrTeamPositionDetailVO> teamList;
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

    public HrTeamPositionDetailVO getTeamInfo() {
        return teamInfo;
    }

    public void setTeamInfo(HrTeamPositionDetailVO teamInfo) {
        this.teamInfo = teamInfo;
    }

    public List<HrTeamPositionDetailVO> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<HrTeamPositionDetailVO> teamList) {
        this.teamList = teamList;
    }

    public Set<String> getPositionCity() {
        return positionCity;
    }

    public void setPositionCity(Set<String> positionCity) {
        this.positionCity = positionCity;
    }
}
