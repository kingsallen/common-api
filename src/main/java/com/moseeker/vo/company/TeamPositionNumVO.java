package com.moseeker.vo.company;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/8/20.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TeamPositionNumVO {
    private int teamId;
    private int count;

}
