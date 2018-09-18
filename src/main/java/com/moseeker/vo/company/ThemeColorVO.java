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

}
