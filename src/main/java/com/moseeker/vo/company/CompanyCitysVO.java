package com.moseeker.vo.company;

import java.util.Set;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/6/4.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CompanyCitysVO {
    private Integer companyId;
    private Set<String> citys;

}
