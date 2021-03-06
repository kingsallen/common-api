/*
 * This file is generated by jOOQ.
*/
package com.moseeker.vo.talentpool.basic;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.sql.Timestamp;


/**
 * 简历搬家操作记录表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(description = "简历搬家操作记录")
public class TalentpoolProfileMoveRecordVO {

    private Integer   id;
    private Integer   profileMoveId;
    @ApiModelProperty(value = "thirdparty_account_company.id")
    private Integer   thirdpartyCompanyId;
    @ApiModelProperty(value = "简历类型 0.主动投递简历  1.已下载简历", dataType="java.lang.Integer")
    private Byte      crawlType;
    @ApiModelProperty(value = "本次简历搬家获取简历数")
    private Integer   crawlNum;
    @ApiModelProperty(value = "'0.获取失败 1.已完成 2.获取中", dataType="java.lang.Integer")
    private Byte      status;
    @ApiModelProperty(value = "当前执行的简历搬家的第n封邮件")
    private Integer   currentEmailNum;
    @ApiModelProperty(value = "本次简历搬家的邮件总数")
    private Integer   totalEmailNum;
    @ApiModelProperty(value = "创建时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;
    @ApiModelProperty(value = "更新时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;

}
