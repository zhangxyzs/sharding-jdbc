package com.zhangxy.sharding.service;

import com.zhangxy.sharding.entity.Order;

import java.util.List;

/**
 * 用户接口
 */
public interface OrderService {

    public Integer insert(Order o);

    public List<Order> findAll();


}
