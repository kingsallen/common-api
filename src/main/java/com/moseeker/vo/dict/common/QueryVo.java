package com.moseeker.vo.dict.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 用于接收httpservlet中的不定参数，之前用query接收的参数现在都继承此vo
 *
 * @author cjm
 * @date 2018-08-28 11:13
 **/
@Data
public class QueryVo implements Serializable{

    public Integer page;
    public Integer per_page;
    public String order;
    public String fields;
    public String groups;

}
