package com.moseeker;/**
 * Created by zztaiwll on 18/12/10.
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.poi.ss.formula.functions.T;

/**
 * @version 1.0
 * @className ResultObjectAlphadog
 * @Description TODO
 * @Author zztaiwll
 * @DATE 18/12/10 下午2:28
 **/
@Data
public class ResultObjectAlphadog<T> {
    private String status;
    private String message;
    private T data;
}
