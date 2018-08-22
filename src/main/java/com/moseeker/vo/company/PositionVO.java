package com.moseeker.vo.company;

import com.moseeker.vo.position.basic.JobPositionVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/8/22.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PositionVO {

    private JobPositionVO positionVO;
    private Integer topicId;

    public JobPositionVO getPositionVO() {
        return positionVO;
    }

    public void setPositionVO(JobPositionVO positionVO) {
        this.positionVO = positionVO;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }
}
