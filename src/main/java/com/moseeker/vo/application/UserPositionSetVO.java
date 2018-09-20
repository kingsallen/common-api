package com.moseeker.vo.application;

import java.util.Set;
import lombok.Data;

/**
 * Created by moseeker on 2018/9/20.
 */
@Data
public class UserPositionSetVO {
    private Set<Integer> positionIds;
    private Set<Integer> userIds;
    private Integer companyId;

}
