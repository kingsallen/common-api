package com.moseeker.vo.jobboard;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Channels
 *
 * @Author: lee
 * @Date: 2019/2/26
 */
@Data
public class Channels {

    @ApiModelProperty(value = "对接渠道", example = "13")
    private Integer channel;
    @ApiModelProperty(value = "猎头编号集合")
    private List<Integer> headhunterIdList;
}
