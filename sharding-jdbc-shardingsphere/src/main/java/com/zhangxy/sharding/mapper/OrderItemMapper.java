package com.zhangxy.sharding.mapper;

import com.zhangxy.sharding.entity.OrderItem;

import java.util.List;

/**
 * OrderItem 数据库接口类
 *
 * @author zhangxy
 * @date 2019/03/01
 **/
public interface OrderItemMapper {

    void createIfNotExistsTable();

    void truncateTable();

    Long insert(OrderItem model);

    void delete(Long orderItemId);

    void dropTable();

    List<OrderItem> selectAll();


}
