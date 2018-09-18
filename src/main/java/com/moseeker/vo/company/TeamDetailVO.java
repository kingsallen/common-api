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

}
