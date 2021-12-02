package com.huey.learning.dubbo.sample.annotation;

import org.apache.dubbo.config.annotation.Service;

/**
 * @author huey
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }

}
