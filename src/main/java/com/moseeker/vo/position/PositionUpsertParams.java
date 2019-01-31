package com.moseeker.vo.position;

import com.moseeker.vo.position.basic.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by zztaiwll on 18/9/5.
 */
@ApiModel("修改职位的数据模型")
@Data
public class PositionUpsertParams {
    @ApiModelProperty(name="position",value = "职位的信息",required = true)
    private JobPositionDataVO position;
    @ApiModelProperty(name="citys",value = "职位的城市信息",required = false)
    private List<Integer> citys;
    @ApiModelProperty(name="features",value = "职位的福利特色id",required = false)
    private java.util.List<Integer> features;
    @ApiModelProperty(name="extVo",value = "职位的其他信息 ",required = false)
    private JobPositionExtVO extVo;
    @ApiModelProperty(name="",value = "面试流程id ",required = false)
    private Integer interviewProcesId;

}
