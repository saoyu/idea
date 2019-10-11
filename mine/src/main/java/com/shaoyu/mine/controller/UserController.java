package com.shaoyu.mine.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leeshaoyu
 * @description
 * @date 2019/7/31
 */
@RestController
public class UserController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
