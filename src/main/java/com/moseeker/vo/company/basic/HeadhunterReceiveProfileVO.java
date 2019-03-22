package com.moseeker.vo.company.basic;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * HeadhunterReceiveProfileVO
 *
 * @Author: lee
 * @Date: 2019/3/20
 */
@Data
public class HeadhunterReceiveProfileVO {
    //    private Integer profileId;
    @ApiModelProperty(value = "猎头简历Id")
    private Integer hunterProfileId;
    @ApiModelProperty(value = "状态 1:接收, 2:拒绝", dataType = "java.lang.Integer")
    private Integer status;
}
