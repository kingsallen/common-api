package com.moseeker.vo.company.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

/**
 * Created by moseeker on 2018/6/4.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CompanyCitysVO {
	
    private Integer companyId;
    private Set<String> citys;

}
