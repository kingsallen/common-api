package com.moseeker.vo.company.basic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * HeadhunterProfileFormVO
 *
 * @Author: lee
 * @Date: 2019/2/22
 */
@Data
@ApiModel("简历表单数据VO")
public class HeadhunterProfileFormVO {

    @ApiModelProperty(value = "猎头账号Id")
    private Integer headhunterAccountId;
    @ApiModelProperty(value = "简历姓名")
    private String userName;
    @ApiModelProperty(value = "简历邮箱")
    private String email;
    @ApiModelProperty(value = "简历手机号码")
    private String mobile;
}
