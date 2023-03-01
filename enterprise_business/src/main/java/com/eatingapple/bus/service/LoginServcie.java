package com.eatingapple.bus.service;

import com.eatingapple.bus.util.ResponseResult;
import com.eatingapple.entity.User;

public interface LoginServcie {
    ResponseResult login(User user);

    ResponseResult logout();
}
