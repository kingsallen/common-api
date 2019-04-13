package com.moseeker.vo.company.basic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * HeadhunterLoginVO
 *
 * @Author: lee
 * @Date: 2019/1/29
 */
@Data
@ApiModel("猎头登录VO")
public class HeadhunterLoginVO {

    @ApiModelProperty(value = "猎头邮箱")
    private String email;
    @ApiModelProperty(value = "登录密码")
    private String password;
    @ApiModelProperty(value = "猎头公司ID")
    private Integer companyId;
    @ApiModelProperty(value = "hr公司ID")
    private Integer hrCompanyId;
}
