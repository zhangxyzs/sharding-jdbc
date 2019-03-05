package com.zhangxy.sharding.mapper;

import com.zhangxy.sharding.entity.Role;

import java.util.List;

/**
 * User 数据库接口类
 *
 * @author zhangxy
 * @date 2019/03/01
 **/
public interface RoleMapper {

    List<Role> findAll();

}
