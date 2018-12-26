package com.moseeker.vo.profile;

import com.moseeker.vo.parsing.ProfileParsingVO;
import lombok.Data;

/**
 * UpsertProfileFormVO
 *
 * @Author: lee
 * @Date: 2018/12/26
 */
@Data
public class UpsertProfileFormVO {
    private Integer userId;
    private ProfileParsingVO parsingVO;
}
