package com.zhangxy.sharding.entity;

import java.io.Serializable;

/**
 * @author zhangxy
 * @date 2019/03/05
 **/
public class Order implements Serializable {

    private long orderId;

    private Integer userId;

    private String status;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
