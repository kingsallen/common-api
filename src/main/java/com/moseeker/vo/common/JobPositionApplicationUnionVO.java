package com.moseeker.vo.common;

import com.moseeker.vo.application.JobApplicationVO;
import com.moseeker.vo.position.basic.JobPositionVO;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * JobPositionApplicationUnionVO
 *
 * @Author: lee
 * @Date: 2018/12/6
 */
@Data
@ApiModel("JobPositionVO,JobApplicationVO联合VO")
public class JobPositionApplicationUnionVO {
    private JobPositionVO positionVO;
    private JobApplicationVO applicationVO;
}
