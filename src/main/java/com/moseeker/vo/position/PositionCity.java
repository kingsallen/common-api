package com.moseeker.vo.position;


import com.moseeker.vo.dict.basic.DictCityVO;

import java.util.List;

/**
 * Created by zztaiwll on 18/8/27.
 */
public class PositionCity {
    private Integer pid;
    private List<DictCityVO> cityList;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public List<DictCityVO> getCityList() {
        return cityList;
    }

    public void setCityList(List<DictCityVO> cityList) {
        this.cityList = cityList;
    }
}
