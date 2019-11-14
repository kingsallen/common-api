package com.moseeker.vo.profile;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * UserProfileInfo
 *
 * @Author: lee
 * @Date: 2019/1/8
 */
@Data
public class UserProfileInfoVO {

    @ApiModelProperty(value = "user_id")
    private Integer userId;
    @ApiModelProperty(value = "现居住地")
    private String address;
    @ApiModelProperty(value = "工作年限")
    private Integer workExpYears;
    @ApiModelProperty(value = "姓名")
    private String userName;
}
