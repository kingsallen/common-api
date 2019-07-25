package com.moseeker.vo.dict.basic;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class ConstantTreeVO  extends  BaseFieldValue{
    private Integer parentCode;
    @JsonIgnore
    private Integer priority;
    @ApiModelProperty("最多一次选择菜单个数")
    private Integer maxSelect;
    private List<ConstantTreeVO> children;
}
