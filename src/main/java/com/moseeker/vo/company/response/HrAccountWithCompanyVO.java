package com.moseeker.vo.company.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class HrAccountWithCompanyVO {
    @ApiModelProperty(value = "hrId", dataType = "java.lang.Integer")
    private Integer id;
    @ApiModelProperty(value = "姓名")
    private String userName;
    @ApiModelProperty(value = "角色名")
    private String roleName;
    @ApiModelProperty(value = "手机号")
    private String mobile;
    @ApiModelProperty(value = "所属行业")
    private String industry;
    @ApiModelProperty(value = "公司Id")
    private Integer companyId;
    @ApiModelProperty(value = "公司名称")
    private String companyName;
}
