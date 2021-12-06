package com.huey.learning.dubbo.quickstart.springboot.provider;

import com.huey.learning.dubbo.quickstart.springboot.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }

}