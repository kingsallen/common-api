package com.moseeker.vo.jooq.redis;

/**
 * @author cjm
 * @date 2018-09-03 15:43
 **/
public class RedisVoBuilder {

    private RedisVO redisVO = new RedisVO();

    public void buildStr(String str){
        redisVO.setStr(str);
    }

    public void buildStr1(String str1){
        redisVO.setStr1(str1);
    }

    public void buildKeyIdentifier(String keyIdentifier){
        redisVO.setKeyIdentifier(keyIdentifier);
    }

    public void buildAppId(Integer appId){
        redisVO.setAppId(appId);
    }

    public void buildValue(String value){
        redisVO.setValue(value);
    }

    public RedisVO getRedisVO(){
        return redisVO;
    }

}
