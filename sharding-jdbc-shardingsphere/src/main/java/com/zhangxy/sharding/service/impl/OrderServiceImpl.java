package com.zhangxy.sharding.service.impl;

import com.zhangxy.sharding.entity.Order;
import com.zhangxy.sharding.mapper.OrderMapper;
import com.zhangxy.sharding.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户实现
 *
 * @author zhangxy
 * @date 2019/03/01
 **/
@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    @Resource
    public OrderMapper orderMapper;

    public List<Order> findAll() {
        return orderMapper.findAll();
    }

    public boolean insert(Order u) {
        return orderMapper.insert(u) > 0 ? true :false;
    }
}
