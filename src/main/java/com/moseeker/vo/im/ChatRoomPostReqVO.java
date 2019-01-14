package com.moseeker.vo.im;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class ChatRoomPostReqVO implements Serializable {

    private static final long serialVersionUID = -4116434807680491716L;


    @ApiModelProperty(value = "用户id", required = true)
    private Integer sysuserId;

    @ApiModelProperty(value = "HR id", required = true)
    private Integer hraccountId;

}
