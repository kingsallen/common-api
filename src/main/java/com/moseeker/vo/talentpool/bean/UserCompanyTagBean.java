package com.moseeker.vo.talentpool.bean;

import java.util.Set;
import lombok.Data;

/**
 * Created by zztaiwll on 18/4/13.
 *用户下的companytag列表
 *
 */
@Data
public class UserCompanyTagBean {
    private Integer userId;
    private Set<Integer> companytagidList;

}
