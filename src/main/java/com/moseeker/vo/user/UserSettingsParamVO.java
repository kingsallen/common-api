package com.moseeker.vo.user;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserSettingsParamVO {

    @ApiModelProperty("主键")
    private Integer id;

    @ApiModelProperty("user_user.id, 用户id")
    private Integer userId;

    @ApiModelProperty("profile banner 的qiniu 相对url")
    private String  bannerUrl;

    @ApiModelProperty("0:公开, 10:仅对hr公开, 20:完全保密")
    private Byte  privacyPolicy;
    
}
