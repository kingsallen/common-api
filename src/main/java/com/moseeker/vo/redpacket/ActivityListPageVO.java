package com.moseeker.vo.redpacket;

import lombok.Data;

import java.util.List;

/**
 * Created by liuxuhui on 2019/3/13.
 */
@Data
public class ActivityListPageVO {

    private List<ActivityListVO> list;
    private int total;
}
