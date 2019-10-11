package com.shaoyu.springboot.shaoyu_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author Administrator
 */
@Controller
@ResponseBody
public class HelloWorldController {

    @RequestMapping("/hello")

    public String hello() {

        return "Hello World";

    }

}