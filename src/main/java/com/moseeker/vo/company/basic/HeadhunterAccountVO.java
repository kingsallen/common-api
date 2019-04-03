package com.moseeker.vo.company.basic;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;

/**
 * 猎头账号VO
 *
 * @Author: lee
 * @Date: 2019/1/28
 */
@Data
@ApiModel("猎头账号VO")
public class HeadhunterAccountVO {
    private Integer id;
    @ApiModelProperty(value = "猎头邮箱")
    private String email;
    @ApiModelProperty(value = "登录密码")
    private String password;
    @ApiModelProperty(value = "公司ID")
    private Integer companyId;
    @ApiModelProperty(value = "猎头公司名称")
    private String company;
    private Integer hrId;
    @ApiModelProperty(value = "hr公司ID")
    private Integer hrCompanyId;
    private String username;
    @ApiModelProperty(value = "服务开始日期", dataType= "string", example = "2018-12-10")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Timestamp serviceStartTime;
    @ApiModelProperty(value = "服务结束日期", dataType= "string", example = "2018-12-10")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Timestamp serviceEndTime;
    private String contractFilePath;
    @ApiModelProperty(value = "合同类型", example = "master")
    private String contractType;
    private Double feeRate;
    private Integer termOfProtection;//保护期
    private String mobile;//猎头手机号
    private String remark;//备注
    @ApiModelProperty(value = "禁用状态, 0 : 启用， 1 ： 禁用， 2 ： 新用户，需重置密码", dataType = "java.lang.Integer", example = "0")
    private Byte status;
    @ApiModelProperty(value = "创建时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;
    @ApiModelProperty(value = "更新时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;
}
