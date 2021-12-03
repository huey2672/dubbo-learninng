package com.huey.learning.dubbo.sample.servicegroup;

/**
 * @author huey
 */
public class EnglishHelloService implements HelloService{

    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }

}
