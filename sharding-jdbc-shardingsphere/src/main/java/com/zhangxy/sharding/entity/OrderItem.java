package com.zhangxy.sharding.entity;

/**
 * OrderItem
 *
 * @author zhangxy
 * @date 2019/03/08
 **/
public class OrderItem {
    private long orderItemId;
    private long orderId;
    private Integer userId;
    public long getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(long orderItemId) {
        this.orderItemId = orderItemId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}
