package com.moseeker.vo.dict.request;

import com.moseeker.vo.dict.basic.DictPositionPO;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class PositionVO {

    private int code;
    private String name;
    private int parent;
    private int level;
    private List<PositionVO> positions;

    public void cloneFromDictPosition(DictPositionPO dictPosition) {
        if (dictPosition == null) {
            return;
        }
        if (dictPosition.getCode() != null) {
            setCode(dictPosition.getCode());
        }
        setName(dictPosition.getName());
        if (dictPosition.getParent() != null) {
            setParent(dictPosition.getParent());
        }
        if (dictPosition.getLevel() != null) {
            setLevel(dictPosition.getLevel());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionVO)) return false;

        PositionVO position = (PositionVO) o;

        return getCode() == position.getCode();
    }

    @Override
    public int hashCode() {
        return getCode();
    }

}
