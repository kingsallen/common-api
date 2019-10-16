package com.moseeker.vo.position;/**
 * Created by zztaiwll on 18/11/30.
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @version 1.0
 * @className PositionOperatorVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 18/11/30 上午11:34
 **/
@Data
@ApiModel(value = "职位操作的数据模型，用于职位上架下架删除的传参")
public class PositionOperatorVO {
    @ApiModelProperty(value = "职位id的列表",required = true,dataType = "java.util.List")
    private List<Integer> pidList;
    @ApiModelProperty(value = "公司编号",required = true,dataType = "int")
    private Integer companyId;
    @ApiModelProperty(value = "hr编号",required = true,dataType = "int")
    private Integer hrId;
}
