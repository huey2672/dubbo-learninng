package com.huey.learning.dubbo.sample.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * @author huey
 */
public class AnnotationSampleConsumerApp {

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(DubboConsumerConfiguration.class);
        HelloAction helloAction = context.getBean(HelloAction.class);
        System.out.println(helloAction.sayHello("World"));
    }

}
