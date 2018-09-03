package com.moseeker.vo.dict.request;

import com.moseeker.vo.dict.basic.DictCityPO;
import lombok.Data;

import java.util.List;

/**
 * Created by jack on 2018/5/18.
 */
@Data
public class CityVO {

    private int code;
    private String name;
    private int level;
    private boolean hotCity;
    private String ename;
    private boolean active;
    private List<CityVO> cities;

    public void cloneFromDictCity(DictCityPO city) {
        if (city == null) {
            return;
        }
        if (city.getCode() != null) {
            setCode(city.getCode());
        }
        if (city.getLevel() != null) {
            setLevel(city.getLevel());
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

        return getCode() == city.getCode();
    }

    @Override
    public int hashCode() {
        return getCode();
    }
}
