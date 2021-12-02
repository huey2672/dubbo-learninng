package com.huey.learning.dubbo.sample.zk;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author huey
 */
public class ZkSampleProviderApp {

    public static void main(String[] args) throws Exception {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-provider.xml");
        System.in.read();
    }

}
