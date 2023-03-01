package com.eatingapple.controller;

import com.eatingapple.entity.User;
import com.eatingapple.service.LoginServcie;
import com.eatingapple.util.ResponseResult;
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
