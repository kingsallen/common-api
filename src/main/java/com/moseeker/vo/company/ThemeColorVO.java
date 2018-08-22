package com.moseeker.vo.company;

import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/6/12.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ThemeColorVO {
    private List<ColorDataVO> colorList;
    private boolean customrized;
    private Integer selectedId;

    public List<ColorDataVO> getColorList() {
        return colorList;
    }

    public void setColorList(List<ColorDataVO> colorList) {
        this.colorList = colorList;
    }

    public boolean isCustomrized() {
        return customrized;
    }

    public void setCustomrized(boolean customrized) {
        this.customrized = customrized;
    }

    public Integer getSelectedId() {
        return selectedId;
    }

    public void setSelectedId(Integer selectedId) {
        this.selectedId = selectedId;
    }
}
