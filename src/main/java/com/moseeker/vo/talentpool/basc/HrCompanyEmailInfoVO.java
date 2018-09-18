/*
 * This file is generated by jOOQ.
*/
package com.moseeker.vo.talentpool.basc;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.sql.Timestamp;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * 企业邮件总量信息表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(description = "企业邮件总量信息")
public class HrCompanyEmailInfoVO {

    private Integer   id;
    private Integer   companyId;
    @ApiModelProperty(value = "邮件总量")
    private Integer   total;
    @ApiModelProperty(value = "邮件剩余量")
    private Integer   balance;
    private Timestamp createTime;
    private Timestamp updateTime;

}
