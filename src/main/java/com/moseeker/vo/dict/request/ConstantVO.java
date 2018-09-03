package com.moseeker.vo.dict.request;

import com.moseeker.vo.dict.basic.DictConstantPO;

import java.util.List;

/**
 * Created by jack on 2018/5/30.
 */
public class ConstantVO {

    private int code;
    private String name;
    private int priority;
    private int parentCode;
    private long createTime;
    private long updateTime;
    private List<ConstantVO> constants;

    public void cloneFromDictConstant(DictConstantPO dictConstant) {
        if (dictConstant == null) {
            return;
        }
        if (dictConstant.getCode() != null) {
            setCode(dictConstant.getCode());
        }
        setName(dictConstant.getName());
        if (dictConstant.getPriority() != null) {
            setPriority(dictConstant.getPriority());
        }
        if (dictConstant.getParentCode() != null) {
            setParentCode(dictConstant.getParentCode());
        }
        if (dictConstant.getCreateTime() != null) {
            setCreateTime(dictConstant.getCreateTime().getTime());
        }
        if (dictConstant.getUpdateTime() != null) {
            setUpdateTime(dictConstant.getUpdateTime().getTime());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConstantVO)) return false;

        ConstantVO constant = (ConstantVO) o;

        if (getCode() != constant.getCode()) return false;
        return getParentCode() == constant.getParentCode();
    }

    @Override
    public int hashCode() {
        int result = getCode();
        result = 31 * result + getParentCode();
        return result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getParentCode() {
        return parentCode;
    }

    public void setParentCode(int parentCode) {
        this.parentCode = parentCode;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public List<ConstantVO> getConstants() {
        return constants;
    }

    public void setConstants(List<ConstantVO> constants) {
        this.constants = constants;
    }
}
