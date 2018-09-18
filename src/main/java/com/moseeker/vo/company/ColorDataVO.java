package com.moseeker.vo.company;

import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/6/12.
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class ColorDataVO {
    private Integer id;
    private List<String> colors;
    private Integer type;

}
