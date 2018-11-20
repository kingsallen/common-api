package com.moseeker.vo.dict.request;

import com.moseeker.vo.dict.basic.DictCityPO;
import com.moseeker.vo.dict.response.DictCityVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @author cjm
 * @date 2018/09/04
 */
@Data
@ApiModel
@ToString
public class CityVO {
    @ApiModelProperty(value = "city_code", name = "code", dataType = "Integer")
    private Integer code;
    @ApiModelProperty(value = "city_name", name = "name", dataType = "string")
    private String name;
    @ApiModelProperty(value = "city_level", name = "level", dataType = "Integer")
    private Integer level;
    @ApiModelProperty(value = "is_hot_city", name = "hotCity", dataType = "Boolean")
    private Boolean hotCity;
    @ApiModelProperty(value = "英语城市名", name = "ename", dataType = "string")
    private String ename;
    @ApiModelProperty(value = "is_using 0:没在用 1:在使用", name = "active", dataType = "Boolean")
    private Boolean active;
    @ApiModelProperty(value = "当前城市下级地区，请求时不需要传", name = "cities", dataType = "list")
    private List<CityVO> cities;

    public void cloneFromDictCity(DictCityPO city) {
        if (city == null) {
            return;
        }
        if (city.getCode() != null) {
            setCode(city.getCode());
        }
        if (city.getLevel() != null) {
            setLevel(city.getLevel().intValue());
        }
        setName(city.getName());
        setActive(city.getIsUsing() == 1);
        setEname(city.getEname());
        setHotCity(city.getHotCity() == 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CityVO)) {
            return false;
        }

        CityVO city = (CityVO) o;

        return getCode().equals(city.getCode());
    }

    @Override
    public int hashCode() {
        return getCode();
    }
}
