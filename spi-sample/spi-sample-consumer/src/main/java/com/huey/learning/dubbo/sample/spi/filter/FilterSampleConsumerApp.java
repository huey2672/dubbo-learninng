package com.huey.learning.dubbo.sample.spi.filter;

import com.huey.learning.dubbo.sample.spi.HelloService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author huey
 */
public class FilterSampleConsumerApp {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("filter/dubbo-consumer.xml");
        HelloService helloService = context.getBean(HelloService.class);
        System.out.println(helloService.sayHello("World"));
    }

}
