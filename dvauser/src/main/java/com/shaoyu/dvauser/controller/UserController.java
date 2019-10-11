package com.shaoyu.dvauser.controller;

import com.shaoyu.dvauser.DO.User;
import com.shaoyu.dvauser.mapper.UserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author leeshaoyu
 * @description
 * @date 2019/9/22
 */

@RestController
@RequestMapping("/api/users")
@Api(value = "user", tags = {"user"})
public class UserController {

    @Resource
    private UserMapper userMapper;

    @GetMapping("/select")
    @ApiOperation("s")
    public User selete(@RequestParam Long id) {
        return userMapper.selete(id);
    }

    @GetMapping("/user")
    @ApiOperation("s")
    public List<User> listAll() {
        return userMapper.list();
    }

    @DeleteMapping("/delete")
    @ApiOperation("d")
    public Integer delete(@RequestParam Long id) {
        return userMapper.delete(id);
    }

    @PutMapping("/insert")
    @ApiOperation("i")
    public Integer insert(@RequestBody User user) {
        return userMapper.insert(user);
    }

    @PostMapping("/update")
    @ApiOperation("u")
    public Integer update(@RequestBody User user) {
        return userMapper.update(user);
    }

    @GetMapping("/iii")
//    @ApiOperation("null")
    public String iii() {
        return "success";
    }
}
