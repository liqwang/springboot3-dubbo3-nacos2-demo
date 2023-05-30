package com.example.consumer.controller;

import com.example.common.dubbo.MyService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @DubboReference
    private MyService myService;

    @GetMapping("/hello")
    public String hello(){
        return myService.hello();
    }
}
