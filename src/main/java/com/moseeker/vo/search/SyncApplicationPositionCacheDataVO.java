package com.moseeker.vo.search;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author yehu
 * date 2019-10-31 18:05
 */
@Data
@ApiModel("同步申请里面冗余的职位信息")
public class SyncApplicationPositionCacheDataVO {

    @ApiModelProperty(value = "职位id列表")
    private List<Integer> pidList;

    @ApiModelProperty(value = "职位的状态",required = false)
    private Integer status;

    @ApiModelProperty(value = "职位是否内推(1是0否)",required = false)
    private Integer isRefer;

    @ApiModelProperty(value = "职位名称",required = false)
    private String title;

    @ApiModelProperty(value = "职位协作人的id列表",required = false)
    private String coordinatorHrIdListStr;
}
