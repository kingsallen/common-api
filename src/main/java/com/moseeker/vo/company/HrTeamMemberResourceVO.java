package com.moseeker.vo.company;


import com.moseeker.vo.company.basic.HrResourceVO;
import com.moseeker.vo.company.basic.HrTeamMemberVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/6/1.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HrTeamMemberResourceVO {
    private HrTeamMemberVO memberInfo;
    private HrResourceVO memberPic;

}
