package com.moseeker.vo.talentpool.bean;

import java.util.Set;
import lombok.Data;

/**
 * Created by zztaiwll on 17/12/29.
 */
@Data
public class ValidateTalentBean {

    private Set<Integer> unUseUserIdSet;
    private Set<Integer> userIdSet;

}
