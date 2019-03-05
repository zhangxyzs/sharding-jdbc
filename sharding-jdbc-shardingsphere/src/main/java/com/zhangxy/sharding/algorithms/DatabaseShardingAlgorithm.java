package com.zhangxy.sharding.algorithms;

import com.alibaba.fastjson.JSON;
import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;
import lombok.extern.slf4j.Slf4j;

import java.util.Collection;

/**
 * 分库策略
 *
 * @author zhangxy
 * @date 2019/03/05
 **/
@Slf4j
public class DatabaseShardingAlgorithm implements PreciseShardingAlgorithm<Integer> {
    /**
     *
     * @param collection 指库的集合
     * @param preciseShardingValue 指表的集合
     * @return
     */
    public String doSharding(Collection<String> collection, PreciseShardingValue<Integer> preciseShardingValue) {
        log.info("collection:" + JSON.toJSONString(collection) + ",preciseShardingValue:" + JSON.toJSONString(preciseShardingValue));
        for (String name : collection) {
            if (name.endsWith(preciseShardingValue.getValue() % collection.size() + "")) {
                log.info("return name:"+name);
                return name;
            }
        }
        return null;
    }

}
