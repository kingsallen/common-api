package com.moseeker.vo.position;

import com.moseeker.vo.company.response.CompanyAddressDataVO;
import com.moseeker.vo.dict.basic.DictCityVO;
import lombok.Data;

import java.util.List;

@Data
public class PositionAddress {
    private Integer pid;
    private List<CompanyAddressDataVO> addressList;
}
