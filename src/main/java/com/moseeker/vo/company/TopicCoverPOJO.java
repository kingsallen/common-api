package com.moseeker.vo.company;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/6/14.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TopicCoverPOJO {
    private String shareTitle;
    private String shareLogo;
    private String shareDescription;


}
