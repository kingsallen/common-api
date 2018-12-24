package com.moseeker.vo.profile;

import com.moseeker.vo.user.basic.UserUserVO;
import lombok.Data;

import java.util.Map;

/**
 * ProfileItemVO
 *
 * @Author: lee
 * @Date: 2018/12/24
 */
@Data
public class ProfileItemVO {
    private UserUserVO user;
    private Map<String, Object> resume;
    private String profile;
}
