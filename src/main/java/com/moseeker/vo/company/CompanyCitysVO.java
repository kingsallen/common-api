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

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Set<String> getCitys() {
        return citys;
    }

    public void setCitys(Set<String> citys) {
        this.citys = citys;
    }
}
