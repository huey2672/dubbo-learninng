package com.huey.learning.dubbo.quickstart;

/**
 * @author huey
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }

}