package com.huey.learning.dubbo.sample.annotation;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

/**
 * @author huey
 */
@Component
public class HelloAction {

    @DubboReference
    private HelloService service;

    public String sayHello(String name) {
        return service.sayHello(name);
    }

}
