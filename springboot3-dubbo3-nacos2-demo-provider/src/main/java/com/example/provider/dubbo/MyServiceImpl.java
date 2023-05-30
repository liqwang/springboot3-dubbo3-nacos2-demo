package com.example.provider.dubbo;

import com.example.common.dubbo.MyService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class MyServiceImpl implements MyService {
    @Override
    public String hello() {
        return "Hello World";
    }
}
