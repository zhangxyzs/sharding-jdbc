package com.zhangxy.sharding.mapper;

import com.zhangxy.sharding.entity.Order;

import java.util.List;

/**
 * User 数据库接口类
 *
 * @author zhangxy
 * @date 2019/03/01
 **/
public interface OrderMapper {

    List<Order> findAll();

    Integer insert(Order o);


}
