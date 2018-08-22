package com.moseeker.vo.dict;

import com.moseeker.vo.dict.basic.DictCollegeVO;

import java.util.List;
import java.util.Optional;

/**
 * Created by jack on 2018/5/24.
 */
public class CollegeVO {

    private String city;
    private int code;
    private String  name;
    private int cityCode;
    private String  logo;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void cloneFromDictColleage(DictCollegeVO college, List<CityVO> cities) {
        if (college == null) {
            return;
        }
        if (college.getProvince() != null) {
            this.setCityCode(college.getProvince());
            if (cities != null ) {
                Optional<CityVO> optional = cities
                        .stream()
                        .filter(city1 -> city1.getCode() == this.getCityCode())
                        .findAny();
                if (optional.isPresent()) {
                    this.setCity(optional.get().getName());
                }
            }
        }
        if (college.getCode() != null) {
            setCode(college.getCode());
        }
        setName(college.getName());
        setLogo(college.getLogo());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CollegeVO)) return false;

        CollegeVO college = (CollegeVO) o;

        return getCode() == college.getCode();
    }

    @Override
    public int hashCode() {
        return getCode();
    }
}
