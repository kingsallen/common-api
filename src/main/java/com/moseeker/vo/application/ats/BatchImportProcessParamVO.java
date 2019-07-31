package com.moseeker.vo.application.ats;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * BatchImportProcessParamVO
 *
 * @Author: lee
 * @Date: 2019/7/17
 */
@Data
public class BatchImportProcessParamVO {
    @ApiModelProperty(name = "companyId", value = "公司Id", dataType = "int", required = true, example = "39978")
    private Integer companyId;
    @ApiModelProperty(name = "hrId", value = "hrId", dataType = "int", required = true, example = "39978")
    private Integer hrId;
    private Integer timeout;
    @ApiModelProperty(name = "emailAddress", value = "hr邮箱", dataType = "string", required = true, example = "ex@moseeker.com")
    private String emailAddress;
    private List<HrAtsImportProcessVO> data;
}
