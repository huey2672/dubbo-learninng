package com.huey.learning.dubbo.sample.zk;

/**
 * @author huey
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }

}
