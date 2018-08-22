package com.moseeker.vo.company;

import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/6/4.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CompanyAccountsVO {
    private Integer companyId;
    private List<Integer> publisherList;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public List<Integer> getPublisherList() {
        return publisherList;
    }

    public void setPublisherList(List<Integer> publisherList) {
        this.publisherList = publisherList;
    }
}
