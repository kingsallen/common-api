package com.moseeker.vo.dict.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by zztaiwll on 18/7/24.
 */
@ApiModel(value = "行业字典")
@Data
public class DictIndustryVO {
    @ApiModelProperty(value = "字典code",required = false)
    private Integer code;
    @ApiModelProperty(value = "字典name",required = false)
    private String  name;
    @ApiModelProperty(value = "字典分类code",required = false)

    private Integer type;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
