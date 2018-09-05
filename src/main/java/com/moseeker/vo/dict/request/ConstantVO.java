package com.moseeker.vo.dict.request;

import com.moseeker.vo.dict.basic.DictConstantPO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * Created by jack on 2018/5/30.
 */
@Data
@ToString
@ApiModel
public class ConstantVO {
    @ApiModelProperty(name = "code", value = "常量code", dataType = "Integer")
    private Integer code;
    @ApiModelProperty(name = "name", value = "常量name", dataType = "string")
    private String name;
    @ApiModelProperty(name = "priority", value = "常量优先级", dataType = "Integer")
    private Integer priority;
    @ApiModelProperty(name = "parentCode", value = "常量父code", dataType = "Integer")
    private Integer parentCode;
    private Long createTime;
    private Long updateTime;
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
            setPriority(dictConstant.getPriority().intValue());
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

        if (!getCode().equals(constant.getCode())) return false;
        return getParentCode().equals(constant.getParentCode());
    }

    @Override
    public int hashCode() {
        int result = getCode();
        result = 31 * result + getParentCode();
        return result;
    }
}
