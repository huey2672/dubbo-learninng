package com.huey.learning.dubbo.quickstart.springboot.provider;

import com.huey.learning.dubbo.quickstart.springboot.HelloService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }

}