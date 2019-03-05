package com.zhangxy.sharding.algorithm;

import com.zhangxy.sharding.entity.Order;
import com.zhangxy.sharding.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 测试Order分库分表策略
 *
 * @author zhangxy
 * @date 2019/03/05
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:config/spring/spring-database.xml", "classpath*:config/spring/spring-sharding.xml"})
public class TestOrder {
    @Resource
    public OrderService orderService;

    @Test
    public void testOrderInsert() {
        Order o = new Order();
        o.setOrderId(1233);
        o.setUserId(11111);
        o.setStatus("1");
        orderService.insert(o);
    }
}
