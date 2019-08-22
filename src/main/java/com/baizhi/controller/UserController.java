package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {

    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping("add")
    public String add(){
        return "add";
    }

    @RequestMapping("show")
    public String show(){
        return "show";
    }
}
