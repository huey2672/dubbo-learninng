package com.huey.learning.dubbo.sample.zk;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author huey
 */
public class ZkSampleConsumerApp {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
        HelloService helloService = context.getBean(HelloService.class);
        System.out.println(helloService.sayHello("World"));
    }

}
