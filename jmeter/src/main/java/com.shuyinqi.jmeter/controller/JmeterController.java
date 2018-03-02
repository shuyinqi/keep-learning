package com.shuyinqi.jmeter.controller;

import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shuyinqi on 2018/3/1.
 */
@RestController
@RequestMapping("/jmeter")
public class JmeterController {

    @RequestMapping("/index")
    public String index(){
        return "hello world";
    }
}
