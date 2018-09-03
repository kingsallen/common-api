package com.moseeker.vo.jooq.redis;

import lombok.Data;
import lombok.ToString;

/**
 * @author cjm
 * @date 2018-08-31 11:11
 **/
@Data
@ToString
public class RedisVO {

    private Integer appId;
    private String keyIdentifier;
    private String str;
    private String str1;
    private String value;

    public RedisVO(Integer appId, String keyIdentifier, String str, String str1, String value) {
        this.appId = appId;
        this.keyIdentifier = keyIdentifier;
        this.str = str;
        this.str1 = str1;
        this.value = value;
    }

    public RedisVO(Integer appId, String keyIdentifier, String str, String value) {
        this.appId = appId;
        this.keyIdentifier = keyIdentifier;
        this.str = str;
        this.value = value;
    }

    public RedisVO() {
    }
}
