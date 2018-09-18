package com.moseeker.vo.company;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/6/6.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HrNpsInfoVO {
    private int id;
    private String date;
    private int hrAccountId;
    private String hrMobile;
    private Byte hrAccountType;
    private String company;
    private Byte intention;
    private Byte acceptContact;
    private String recommendUser;
    private String recommendMobile;
    private String recommendCompany;
    private int companyId;
    private int companyType;

}
