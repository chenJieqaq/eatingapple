package com.eatingapple.service.impl;

import com.eatingapple.entity.User;
import com.eatingapple.mapper.UserMapper;
import com.eatingapple.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public void create() {
        User user = new User();
        user.setSex("男");
        userMapper.insert(user);
    }
}
