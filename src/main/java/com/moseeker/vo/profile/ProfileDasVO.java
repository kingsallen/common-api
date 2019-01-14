package com.moseeker.vo.profile;

import lombok.Data;

import java.util.List;

/**
 * ProfileDasVO
 *
 * @Author: lee
 * @Date: 2019/1/9
 */
@Data
public class ProfileDasVO {

    private List<Integer> hrAccountIds;
    private String name;
    private Integer pageNum;
    private Integer pageSize;
}
