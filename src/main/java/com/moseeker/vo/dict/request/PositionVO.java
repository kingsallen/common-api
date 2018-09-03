package com.moseeker.vo.dict.request;

import com.moseeker.vo.dict.basic.DictPositionPO;

import java.util.List;


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

    public int getParent() {
        return parent;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<PositionVO> getPositions() {
        return positions;
    }

    public void setPositions(List<PositionVO> positions) {
        this.positions = positions;
    }
}
