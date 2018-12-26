package com.moseeker;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by zztaiwll on 18/8/28.
 */
@ApiModel(value = "分页查询数据")
@Data
public class PageData<T> {
    @ApiModelProperty(value = "数据总数",required = false)
    private Integer total;
    @ApiModelProperty(value = "页号",required = false)
    private Integer page;
    @ApiModelProperty(value = "数据",required = false)
    private List<T> data;
    @ApiModelProperty(value = "每页数量",required = false)
    private Integer pageSize;
    public PageData(){}

    public PageData(Integer total, Integer page, List<T> data, Integer pageSize) {
        if(page==null||page==0){
            page=1;
        }else{
            this.page = page;
        }
        this.total = total;

        this.data = data;
        if(pageSize==null||pageSize==0){
            pageSize=15;
        }else{
            this.pageSize = pageSize;
        }

    }
}
