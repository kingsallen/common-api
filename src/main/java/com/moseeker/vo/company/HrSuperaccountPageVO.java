package com.moseeker.vo.company;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/8/28.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HrSuperaccountPageVO {
	
    public Integer id;
    public String createTime;
    public String name;
    public String username;
    public String mobile;
    public String email;
    public String status;
    public String licence;
    public Integer companyType;

}
