package com.moseeker.vo.talentpool.bean;

import com.moseeker.vo.company.basic.UserHrAccountVO;
import java.util.Set;
import lombok.Data;

/**
 * Created by moseeker on 2018/9/25.
 */
@Data
public class UserAndHrAccountVO {

    private Integer userId;
    private Set<UserHrAccountVO> accountSet;
}
