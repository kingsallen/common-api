package com.moseeker.vo.company.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author yehu
 * date 2019-09-11 11:46
 */
@Data
@ApiModel("批量淘汰参数实体类")
public class ApplicationObsoleteParamVO {

    @ApiModelProperty("申请id列表")
    private List<Integer> appIdList;

    @ApiModelProperty("淘汰理由code")
    private Integer   reasonCode;

    @ApiModelProperty("淘汰理由")
    private String    reason;

    @ApiModelProperty("淘汰备注")
    private String    remark;

    @ApiModelProperty("操作的hrId")
    private Integer   hrId;
}
