package com.moseeker.vo.dict.request;

import com.moseeker.vo.dict.basic.DictCityVO;
import lombok.Data;

import java.util.Map;

/**
 * @Date: 2018/12/15
 * @Author: JackYang
 */
@Data
public class CityLevelVO {

    DictCityVO city;
    Map<Integer, DictCityVO> allCity;
}
