package com.eatingapple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author shuaku
 */
@RestController
@RequestMapping("/hello")
public class HeloController {

    @RequestMapping("/1")
    @ResponseBody
    public String hello() {
        return "hello";
    }


    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestBody Map dataMap) {

    return "hello";
    }
}
