package com.eatingapple.bus.controller;

import com.eatingapple.bus.service.LoginServcie;
import com.eatingapple.bus.util.ResponseResult;
import com.eatingapple.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    LoginServcie loginServcie;
    @RestController
    public class HelloController {

        @PostMapping("/user/login")
        public ResponseResult hello(@RequestBody User user){
            return loginServcie.login(user);
        }
    }
}
