package com.moseeker.vo.talentpool.resp;

import java.util.List;
import java.util.Set;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/9/19.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TalentHrTagVO {

    private Set<Integer> nopower;
    private List<UserTagVO> use;
}
