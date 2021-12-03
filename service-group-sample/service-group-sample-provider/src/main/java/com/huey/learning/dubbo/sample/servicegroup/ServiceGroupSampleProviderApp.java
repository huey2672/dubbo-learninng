package com.huey.learning.dubbo.sample.servicegroup;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author huey
 */
public class ServiceGroupSampleProviderApp {

    public static void main(String[] args) throws Exception {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-provider.xml");
        System.in.read();
    }

}
