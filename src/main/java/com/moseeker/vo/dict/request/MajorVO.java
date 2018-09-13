package com.moseeker.vo.dict.request;

import com.moseeker.vo.dict.basic.DictMajorPO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;
import java.util.Objects;

/**
 * @author cjm
 * @date 2018/09/03
 */
@Data
@ToString
public class MajorVO {

    private String code;
    private String name;
    private Integer level;
    private List<MajorVO> majors;

    public void cloneFromDictMajor(DictMajorPO dictMajor) {
        if (dictMajor == null) {
            return;
        }
        if (dictMajor.getCode() != null) {
            try {
                setCode(dictMajor.getCode());
            } catch (NumberFormatException e) {
                //do nothing
            }
        }
        if (dictMajor.getLevel() != null) {
            setLevel(dictMajor.getLevel().intValue());
        }
        setName(dictMajor.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MajorVO)) return false;

        MajorVO major = (MajorVO) o;

        return getCode().equals(major.getCode());
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(getCode());
    }
}
