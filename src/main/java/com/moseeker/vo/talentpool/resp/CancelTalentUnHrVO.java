package com.moseeker.vo.talentpool.resp;

import com.moseeker.vo.talentpool.bean.UserAndHrAccountVO;
import java.util.List;
import java.util.Set;
import lombok.Data;

/**
 * Created by moseeker on 2018/9/21.
 */
@Data
public class CancelTalentUnHrVO {

    private Set<Integer> userIds;
    private List<UserAndHrAccountVO> hrs;
}
