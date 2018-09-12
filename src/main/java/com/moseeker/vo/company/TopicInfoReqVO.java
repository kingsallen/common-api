package com.moseeker.vo.company;

import com.moseeker.vo.company.basic.HrTopicVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/9/12.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(description = "公司主题活动信息")
public class TopicInfoReqVO {

    @ApiModelProperty(value = "公司活动主题", required = true)
    private HrTopicVO topicVO;
    @ApiModelProperty(value = "参加主题活动的职位编号")
    private List<Integer> positions;

    public HrTopicVO getTopicVO() {
        return topicVO;
    }

    public void setTopicVO(HrTopicVO topicVO) {
        this.topicVO = topicVO;
    }

    public List<Integer> getPositions() {
        return positions;
    }

    public void setPositions(List<Integer> positions) {
        this.positions = positions;
    }
}
