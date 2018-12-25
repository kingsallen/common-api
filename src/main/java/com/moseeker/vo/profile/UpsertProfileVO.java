package com.moseeker.vo.profile;

import com.moseeker.vo.user.basic.UserUserVO;
import lombok.Data;

import java.util.Map;

/**
 * UpsertProfileVO
 *
 * @Author: lee
 * @Date: 2018/12/25
 */
@Data
public class UpsertProfileVO {
    private Map<String, Object> resume;
    private UserUserVO userUserVO;
    private Integer userId;
    private Integer newUserId;

}
