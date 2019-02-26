package com.moseeker.vo.jobboard;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * HeadHunterFormVO
 *
 * @Author: lee
 * @Date: 2019/2/14
 */
@Data
public class HeadHunterFormVO {
    /**
     * 操作人
     */
    @ApiModelProperty(value = "操作人")
    private Integer userId;
    /**
     * 公司Id
     */
    @ApiModelProperty(value = "公司Id", example = "39978")
    private Integer companyId;
    /**
     * 职位编号
     */
    @ApiModelProperty(value = "职位编号", example = "100")
    private Integer positionId;
    /**
     * 对接渠道
     */
    private Channels channels;

}