package com.eatingapple.service;

import com.eatingapple.entity.User;
import com.eatingapple.util.ResponseResult;

public interface LoginServcie {
    ResponseResult login(User user);

    ResponseResult logout();
}
