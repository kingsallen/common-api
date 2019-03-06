package com.moseeker.vo.company.response;/**
 * Created by zztaiwll on 19/2/25.
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @version 1.0
 * @className ApplicationStatusDataVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 19/2/25 下午4:04
 **/
@Data
@ApiModel("小的招聘状态的数据模型")
public class ApplicationStatusDataVO {
    @ApiModelProperty(name="name",value = "名称",required = true)
    private String name;
    @ApiModelProperty(name="processId",value = "状态id",required = true)
    private int processId;
    @ApiModelProperty(name="order",value = "顺序",required = true)
    private int order;
}
