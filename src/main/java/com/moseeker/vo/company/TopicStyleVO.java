package com.moseeker.vo.company;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/6/14.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TopicStyleVO {
    private int id;
    private String name;
    private String hrTpl;
    private String wxTpl;
    private String logo;


}
