package com.moseeker.vo.company.basic;/**
 * Created by zztaiwll on 19/3/7.
 */

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @version 1.0
 * @className HrOperationAllRecordVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 19/3/7 下午5:08
 **/
@Data
@ApiModel("hr操作的流水的数据模型")
public class HrOperationAllRecordVO {
    @ApiModelProperty(name="id",value = "主键编号",required = true)
    private Integer   id;
    @ApiModelProperty(name="operatorId",value = "操作人的编号",required = true)
    private Integer   operatorId;
    @ApiModelProperty(name="companyId",value = "公司编号",required = true)
    private Integer   companyId;
    @ApiModelProperty(name="userId",value = "简历所有人编号",required = true)
    private Integer   userId;
    @ApiModelProperty(name="title",value = "操作标题",required = true)
    private String    title;
    @ApiModelProperty(name="description",value = "操作描述",required = true)
    private String    description;
    @ApiModelProperty(name="opertaionType",value = "操作类型",required = true)
    private Integer   opertaionType;
    @ApiModelProperty(name="operatorType",value = "操作人类型",required = true)
    private Integer   operatorType;
    @ApiModelProperty(name="optTime",value = "操作时间",required = true)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp optTime;
}
