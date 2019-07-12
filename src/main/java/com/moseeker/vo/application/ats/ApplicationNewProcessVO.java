package com.moseeker.vo.application.ats;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class ApplicationNewProcessVO {
    @ApiModelProperty(name="companyId",value = "公司编号",required = true)
    private Integer companyId;
    @ApiModelProperty(name="hrId",value = "hr编号",required = true)
    private Integer hrId;
    @ApiModelProperty(name="processStatus",value = "跳转到的状态",required = true)
    private Integer processStatus;
    @ApiModelProperty(name="appIds",value = "申请id列表",required = true,dataType="java.util.List")
    private List<Integer> appIds;
}
