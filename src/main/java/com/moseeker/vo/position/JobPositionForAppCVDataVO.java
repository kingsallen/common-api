package com.moseeker.vo.position;/**
 * Created by zztaiwll on 19/2/18.
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @version 1.0
 * @className JobPositionForAppCVDataVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 19/2/18 下午3:44
 **/
@Data
@ApiModel("模板下职位的数据模型")
public class JobPositionForAppCVDataVO {
    @ApiModelProperty(name="appCvConfigId",value="自定义模板id",required = true)
    private int appCvConfigId;
    @ApiModelProperty(name="count",value="职位的数量",required = true)
    private int count;
    @ApiModelProperty(name="positions",value="职位信息",required = true)
    private List<JobPositionSimpleDataVO> positions;
}
