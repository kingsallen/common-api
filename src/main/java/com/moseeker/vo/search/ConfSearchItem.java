package com.moseeker.vo.search;

import lombok.Data;

/**
 * ConfSearchItem
 *
 * @Author: lee
 * @Date: 2019/11/27
 */
@Data
public class ConfSearchItem {
    private String chpe;
    private String name;
    private String es_key;
    private String form_name;
    private String display_key;
    private String key;
    private Integer index;
    /*{
        'chpe': '学历',
            'name': '学历要求',
            'es_key': 'degree_data.name',
            'form_name': 'degree',
            'display_key': 'degree_name',
            'key': 'degree_name',
            'index': '7'
    }*/
}
