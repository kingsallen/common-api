package com.moseeker.vo.application;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * HrAppCvConfVO
 *
 * @Author lee
 * @Date 2018/12/7 下午5:21
 */
@Data
@ApiModel(value = "企业申请简历校验配置")
public class HrAppCvConfVO implements Serializable {

    private static final long serialVersionUID = -1196520402;
    @ApiModelProperty(value = "id", required = false)
    private Integer id;
    @ApiModelProperty(value = "属性含义", required = false)
    private String name;
    @ApiModelProperty(value = "排序字段", required = false)
    private Integer priority;
    @ApiModelProperty(value = "创建时间", required = false)
    private Timestamp createTime;
    @ApiModelProperty(value = "更新时间", required = false)
    private Timestamp updateTime;
    @ApiModelProperty(value = "是否禁用 0：可用1：不可用", required = false)
    private Integer disable;
    @ApiModelProperty(value = "所属部门。如果是私有属性，则存在所属公司部门编号；如果不是则为0 hr_company.id", required = false)
    private Integer companyId;
    @ApiModelProperty(value = "账号编号 hr_account.id", required = false)
    private Integer hraccountId;
    @ApiModelProperty(value = "是否必填项 0：必填项 1：选填项", required = false)
    private Integer required;
    @ApiModelProperty(value = "微信端页面标签默认值", required = false)
    private String fieldValue;

}
