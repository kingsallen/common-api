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
@ApiModel
public class JobPositionForAppCVDataVO {
    private int appCvConfigId;
    private List<JobPositionSimpleDataVO> positions;
}
