package com.iwhalecloud.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leeshaoyu
 * @description
 * @date 2019/8/29
 */
@RestController
@Api(value = "user")
public class UserController {

    @PostMapping("/user")
    @ApiOperation("测试")
    public String user(){
        return "sds";
    }
}
