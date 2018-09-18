package com.moseeker.vo.company;

import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/6/14.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TopicsRespVO {

    private int id;
    private List<PositionVO> positions ;
    private TopicCoverVO cover;
    private TopicStyleVO style;
    private TopicsCompanyVO company;
    private int accountType;
    private String username;
    private int accountId;
    private String mobile;

}
