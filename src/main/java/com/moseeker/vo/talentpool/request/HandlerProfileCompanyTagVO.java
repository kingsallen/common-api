package com.moseeker.vo.talentpool.request;

import java.util.Set;
import lombok.Data;

/**
 * Created by moseeker on 2018/9/29.
 */
@Data
public class HandlerProfileCompanyTagVO {

    private Set<Integer> userIdSet;
    private Integer companyId;
}
