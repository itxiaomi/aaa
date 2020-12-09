package com.itheima.controller;

import com.itheima.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *  @创建时间:  2020/12/8 21:55
 *  @描述：    TODO
 */

@RestController
public class ControllerDemo {


    //@Reference
    UserService userService;

    @RequestMapping("/test")
    public String demo(){

        userService.sayHi();

        return "test";
    }
}
