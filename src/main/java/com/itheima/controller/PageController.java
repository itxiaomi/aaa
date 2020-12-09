package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 *  @创建时间:  2020/12/9 12:50
 *  @描述：    TODO
 */
@Controller
public class PageController {

    @RequestMapping("/{path}")
    public String getPage(@PathVariable("path") String pageName){

        System.out.println("aaaa");

        return pageName;
    }
}
