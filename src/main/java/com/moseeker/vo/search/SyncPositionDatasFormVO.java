package com.moseeker.vo.search;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 功能描述 :
 * @author : JackYang
 * @date : 2019-05-20 15:28
 */
@ApiModel("同步JD的titles数据模型")
@Data
public class SyncPositionDatasFormVO {

    @ApiModelProperty(value = "职位数据")
    List<SyncPositionVO> data;
    @ApiModelProperty(value = "公司id",example = "39978")
    private Integer companyId;

}
