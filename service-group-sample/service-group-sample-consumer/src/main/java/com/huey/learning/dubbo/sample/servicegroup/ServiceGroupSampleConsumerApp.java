package com.huey.learning.dubbo.sample.servicegroup;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author huey
 */
public class ServiceGroupSampleConsumerApp {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
        HelloService chineseHelloService = context.getBean("chineseHelloService", HelloService.class);
        System.out.println(chineseHelloService.sayHello("世界"));
        HelloService englishHelloService = context.getBean("englishHelloService", HelloService.class);
        System.out.println(englishHelloService.sayHello("World"));
    }

}
