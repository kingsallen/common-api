package com.moseeker.vo.company;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/8/23.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MergeAccountVO {
    private Integer currId;
    private Integer logout;
    private Integer needMerge;
    private Integer wxCompanyId;
    private String wxCompanyName;
    private Integer mbCompanyId;
    private String mbCompanyName;

}
