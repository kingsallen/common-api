package com.moseeker.vo.user.basic;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserSettingsVO {

    @ApiModelProperty("主键")
    private int id;

    @ApiModelProperty("user_user.id, 用户id")
    private int userId;

    @ApiModelProperty("profile banner 的qiniu 相对url")
    private String  bannerUrl;

    @ApiModelProperty("0:公开, 10:仅对hr公开, 20:完全保密")
    private byte  privacyPolicy;
    
}
