package com.moseeker.vo.application.ats;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel("流程信息请求参数")
public class HrAtsProcessCompanyRequestVO extends HrAtsProcessCompanyVO {
    @ApiModelProperty(name="dataList",value = "流程具体信息")
    private List<HrAtsProcessCompanyItemVO> dataList;
    @ApiModelProperty(name="hrId",value = "hr编号")
    private Integer hrId;
}
