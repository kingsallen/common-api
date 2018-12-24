package com.moseeker.vo.profile;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * CommonVO
 *
 * @Author: lee
 * @Date: 2018/11/30
 */
@Data
@ApiModel("CommonVO")
public class CommonVO implements Serializable {
    private static final long serialVersionUID = 8115796706122032214L;

    private Integer profileId;
    private Integer accountId;
    private Integer userId;
    private Integer positionId;

    private Integer pageNum;
    private Integer pageSize;
    private String keyword;
    private List<Integer> hrAccountIds;

    private String name;
    private String uuid;
    private String profile;

}
