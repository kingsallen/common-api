package com.moseeker.vo.profile;

import com.moseeker.vo.parsing.ProfileParsingVO;
import com.moseeker.vo.profile.basic.ProfileProfileVO;
import lombok.Data;

/**
 * ProfileFormVO
 *
 * @Author: lee
 * @Date: 2018/12/17
 */
@Data
public class ProfileFormVO {
    private ProfileParsingVO profilePojo;
    private ProfileProfileVO profileProfile;
    private int userId;
}
