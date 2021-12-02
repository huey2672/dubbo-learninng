package com.huey.learning.dubbo.sample.annotation;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * @author huey
 */
@Component
public class HelloAction {

    @Reference
    private HelloService service;

    public String sayHello(String name) {
        return service.sayHello(name);
    }

}
