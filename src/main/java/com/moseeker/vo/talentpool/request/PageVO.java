package com.moseeker.vo.talentpool.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/4/3.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PageVO {
    private int limit;
    private int pageSize;
}
