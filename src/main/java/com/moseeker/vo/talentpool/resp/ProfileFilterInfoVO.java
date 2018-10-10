package com.moseeker.vo.talentpool.resp;

import com.moseeker.vo.talentpool.basc.TalentpoolProfileFilterVO;
import com.moseeker.vo.talentpool.request.ActionFormVO;
import java.util.List;
import lombok.Data;

/**
 * Created by moseeker on 2018/9/28.
 */
@Data
public class ProfileFilterInfoVO {

    private TalentpoolProfileFilterVO profileFilter;
    private Integer positionNum =0;
    private List<FilterPositionVO> position;
    private List<ActionFormVO> action;


}
