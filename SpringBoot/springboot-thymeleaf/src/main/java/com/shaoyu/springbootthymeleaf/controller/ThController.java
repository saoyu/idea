package com.shaoyu.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThController {

    @RequestMapping("/show")
    public String showInfo(Model model){
        model.addAttribute("msg","thymeleaf");
        return "index";
    }
}
