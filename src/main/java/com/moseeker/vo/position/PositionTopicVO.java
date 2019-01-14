package com.moseeker.vo.position;

import com.moseeker.vo.position.basic.JobPositionVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/8/22.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PositionTopicVO extends JobPositionVO{

    private Integer topicId;


}
