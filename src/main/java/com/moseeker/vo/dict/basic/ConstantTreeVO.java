package com.moseeker.vo.dict.basic;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonFilter("emptyfilter")
public class ConstantTreeVO  extends  BaseFieldValue implements Comparable<ConstantTreeVO>{
    private Integer parentCode;
    @JsonIgnore
    private Integer priority;
    @ApiModelProperty("最多一次选择菜单个数")
    private Integer maxSelect;
    private List<ConstantTreeVO> children;

    @Override
    public int compareTo(ConstantTreeVO o) {
        if (o == null || o.getPriority() == null) {
            return -1;
        }
        if (this.getPriority() == null) {
            return 1;
        }
        return this.getPriority() - o.getPriority();
    }
}
