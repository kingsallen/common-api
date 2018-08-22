package com.moseeker.vo.dict;

import com.moseeker.vo.dict.basic.DictCityVO;

import java.util.List;

/**
 * Created by jack on 2018/5/18.
 */
public class CityVO {

    private int code;
    private String name;
    private int level;
    private boolean hotCity;
    private String ename;
    private boolean active;
    private List<CityVO> cities;

    public List<CityVO> getCities() {
        return cities;
    }

    public void setCities(List<CityVO> cities) {
        this.cities = cities;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isHotCity() {
        return hotCity;
    }

    public void setHotCity(boolean hotCity) {
        this.hotCity = hotCity;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void cloneFromDictCity(DictCityVO city) {
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
        if (this == o) return true;
        if (!(o instanceof CityVO)) return false;

        CityVO city = (CityVO) o;

        return getCode() == city.getCode();
    }

    @Override
    public int hashCode() {
        return getCode();
    }
}
