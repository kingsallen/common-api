package com.moseeker.vo.company;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/5/22.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MiniAppCompanyInfoVO {
    private Integer accountId;
    private String abbreviation;
    private String username;
    private boolean type;
    private String headImgUrl;
    private Integer companyId;
    private String name;
    private String signature;


}
