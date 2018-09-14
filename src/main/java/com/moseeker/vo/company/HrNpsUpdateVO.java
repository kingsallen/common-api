package com.moseeker.vo.company;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/6/6.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HrNpsUpdateVO {

    private Integer hrId;
    private String startDate;
    private String endDate;
    private Byte intention;
    private Byte acceptContact;
    private String username;
    private String mobile;
    private String company;

}
