package com.zhangxy.utils;

import io.shardingsphere.core.keygen.DefaultKeyGenerator;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 雪花算法生成的key
 *
 * @author zhangxy
 * @date 2019/03/06
 **/
public class DefaultKeyGeneratorTest {
    public static void main(String[] args) {
        DefaultKeyGenerator defaultKeyGenerator = new DefaultKeyGenerator();//类锁 请求都创建一次
        Map map = new ConcurrentHashMap();
        TlUtil.timeTasks(1000, 1, new Runnable() {
            @Override
            public void run() {
                Number num=defaultKeyGenerator.generateKey();
                map.put(num,num);
            }
        });
        System.out.println(map);


    }

}
