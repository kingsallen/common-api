package com.moseeker.vo.company.basic;/**
 * Created by zztaiwll on 19/3/5.
 */

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @version 1.0
 * @className HrCompanyRecruitProcessVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 19/3/5 下午1:37
 **/
@Data
@ApiModel("公司招聘进度的数据模型")
public class HrCompanyRecruitProcessVO {
    @ApiModelProperty(name="id",value = "主键编号",required = true)
    private Integer   id;
    @ApiModelProperty(name="recruitProcessName",value = "进度名称",required = true)
    private String    recruitProcessName;
    @ApiModelProperty(name="companyId",value = "公司编号",required = true)
    private Integer   companyId;
    @ApiModelProperty(name="disable",value = "状态 0有效 1无效",required = true)
    private Integer   disable;
    @ApiModelProperty(name="processOrder",value = "顺序",required = true)
    private Integer   processOrder;
    @ApiModelProperty(name="createTime",value = "创建时间",required = true)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;
    @ApiModelProperty(name="",value = "更新时间",required = true)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;
}
