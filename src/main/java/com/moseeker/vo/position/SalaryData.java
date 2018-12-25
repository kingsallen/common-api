package com.moseeker.vo.position;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by zztaiwll on 18/7/23.
 */
@ApiModel(value = "工资数据模型")
@Data
public class SalaryData {
    @ApiModelProperty(value = "最高工资",required = false)
    private int salaryTop;
    @ApiModelProperty(value = "最低工资",required = false)
    private int salaryBottom;
}
