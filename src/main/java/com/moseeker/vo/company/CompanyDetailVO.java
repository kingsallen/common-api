package com.moseeker.vo.company;

import java.util.List;
import java.util.Set;

import com.moseeker.vo.company.basic.HrCompanyVO;

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

}
