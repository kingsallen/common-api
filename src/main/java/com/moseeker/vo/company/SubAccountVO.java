package com.moseeker.vo.company;

/**
 * Created by moseeker on 2018/6/19.
 */
public class SubAccountVO {
    private boolean addAccountStatus;
    private Integer accountLimit;

    public boolean isAddAccountStatus() {
        return addAccountStatus;
    }

    public void setAddAccountStatus(boolean addAccountStatus) {
        this.addAccountStatus = addAccountStatus;
    }

    public Integer getAccountLimit() {
        return accountLimit;
    }

    public void setAccountLimit(Integer accountLimit) {
        this.accountLimit = accountLimit;
    }
}
