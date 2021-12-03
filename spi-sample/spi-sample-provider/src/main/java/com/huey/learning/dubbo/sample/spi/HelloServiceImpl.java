package com.huey.learning.dubbo.sample.spi;

public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }

}