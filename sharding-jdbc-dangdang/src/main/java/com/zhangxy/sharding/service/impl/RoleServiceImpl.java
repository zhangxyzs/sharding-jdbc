package com.zhangxy.sharding.service.impl;

import com.zhangxy.sharding.entity.Role;
import com.zhangxy.sharding.mapper.RoleMapper;
import com.zhangxy.sharding.service.RoleService;
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
public class RoleServiceImpl implements RoleService {

    @Resource
    public RoleMapper RoleMapper;

    public List<Role> findAll() {
        return RoleMapper.findAll();
    }


}
