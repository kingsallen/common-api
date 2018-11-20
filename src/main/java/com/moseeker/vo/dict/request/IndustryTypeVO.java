package com.moseeker.vo.dict.request;

import lombok.Data;
import lombok.ToString;

/**
 * @author cjm
 * @date 2018-10-08 17:22
 **/
@Data
@ToString
public class IndustryTypeVO {
    private Integer code;
    private String name;
    private String companyImg;
    private String jobImg;
    private String teamImg;
    private String pcImg;


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IndustryTypeVO)) {
            return false;
        }

        IndustryTypeVO industryType = (IndustryTypeVO) o;

        return getCode().equals(industryType.getCode());
    }


    @Override
    public int hashCode() {
        return getCode();
    }
}
