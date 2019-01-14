package com.moseeker.vo.profile;

import lombok.Data;

import java.util.List;

/**
 * BatchProfilesVO
 *
 * @Author: lee
 * @Date: 2018/12/26
 */
@Data
public class BatchProfilesVO {
    List<String> userIds;
    List<String> uuids;
    List<String> profileIds;
}
