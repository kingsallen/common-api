package com.moseeker.vo.profile;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * RetrieveProfileVO
 *
 * @Author: lee
 * @Date: 2018/12/29
 */
@Data
public class RetrieveProfileVO {
    private Integer positionId;
    private Integer channel;
    @ApiModelProperty(name = "profile", value = "profile Json字符串", example = "{\"id\":1, \"name\": 2}")
    private String profile;
}
