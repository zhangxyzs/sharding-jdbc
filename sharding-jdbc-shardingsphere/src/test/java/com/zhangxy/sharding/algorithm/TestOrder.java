package com.zhangxy.sharding.algorithm;

import com.zhangxy.sharding.entity.Order;
import com.zhangxy.sharding.entity.OrderItem;
import com.zhangxy.sharding.mapper.OrderItemMapper;
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
    @Resource
    public OrderItemMapper orderItemMapper;

    @Test
    public void testOrderInsert() {
        //用户就为10和11
        for (int i = 9990; i < 9999; i++) {
            Order order = new Order();
            order.setUserId(10);
            order.setStatus("insert");
            Integer count=orderService.insert(order);
            System.out.println("gengeratorId:"+order.getOrderId());
            OrderItem orderItem=new OrderItem();
            orderItem.setUserId(10);
            orderItem.setOrderId(order.getOrderId());
            orderItemMapper.insert(orderItem);
        }
        for (int i = 990; i < 999; i++) {
            Order order = new Order();
            order.setUserId(11);
            order.setStatus("insert");
            Integer count=orderService.insert(order);
            System.out.println("gengeratorId:"+order.getOrderId());
            OrderItem orderItem=new OrderItem();
            orderItem.setUserId(11);
            orderItem.setOrderId(order.getOrderId());
            orderItemMapper.insert(orderItem);
        }
    }
}
