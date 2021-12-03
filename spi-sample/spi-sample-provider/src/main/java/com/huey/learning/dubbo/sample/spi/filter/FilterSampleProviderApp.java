package com.huey.learning.dubbo.sample.spi.filter;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author huey
 */
public class FilterSampleProviderApp {

    public static void main(String[] args) throws Exception {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("filter/dubbo-provider.xml");
        System.in.read();
    }

}
