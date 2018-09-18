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

}
