package com.huey.learning.dubbo.sample.servicegroup;

/**
 * @author huey
 */
public class ChineseHelloService implements HelloService{

    @Override
    public String sayHello(String name) {
        return "你好，" + name;
    }

}
