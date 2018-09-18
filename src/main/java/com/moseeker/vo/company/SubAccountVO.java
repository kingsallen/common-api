package com.moseeker.vo.company;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/6/19.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SubAccountVO {
    private boolean addAccountStatus;
    private Integer accountLimit;

}
