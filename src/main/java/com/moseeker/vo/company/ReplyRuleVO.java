package com.moseeker.vo.company;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/6/8.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ReplyRuleVO {
    private int id;
    private String module;
    private String name;
    private String keywords;
    private String content;
    private String title;
    private String description;
    private String url;
    private String thumb;
    private String image;

}
