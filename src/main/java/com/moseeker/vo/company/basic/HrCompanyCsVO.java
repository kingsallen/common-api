package com.moseeker.vo.company.basic;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @Date: 2018/11/9
 * @Author: JackYang
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HrCompanyCsVO implements Serializable {
    private static final long serialVersionUID = 1796802732109329015L;

    private Integer id;
    private Integer companyId;
    private Integer csId;
    private String  email;
    private String  name;

}
