package com.moseeker.vo.dict.request;

import com.moseeker.vo.dict.basic.DictConstantPO;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * Created by jack on 2018/5/30.
 */
@Data
@ToString
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
}
