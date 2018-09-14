package com.moseeker.vo.company;


import java.util.List;

import com.moseeker.vo.company.basic.HrTeamVO;

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

}
