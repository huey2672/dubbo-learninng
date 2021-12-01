package com.huey.learning.dubbo.quickstart.springboot.consumer;

import com.huey.learning.dubbo.quickstart.springboot.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huey
 */
@RestController
public class HelloController {

    @Reference
    private HelloService service;

    @GetMapping("/hello")
    public String hello(String name) {
        return service.sayHello(name);
    }

}
