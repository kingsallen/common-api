package com.moseeker.vo.company;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/5/23.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class LoginInfoVO {

    public String mobile;
    public String email;
    public String password;
    public int wxuserId;
    public String lastLoginIp;

}
