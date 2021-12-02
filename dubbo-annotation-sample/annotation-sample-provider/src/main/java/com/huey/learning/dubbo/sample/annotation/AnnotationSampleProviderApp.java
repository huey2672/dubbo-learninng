package com.huey.learning.dubbo.sample.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * @author huey
 */
public class AnnotationSampleProviderApp {

    public static void main(String[] args) throws Exception {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(DubboProviderConfiguration.class);
        System.in.read();
    }

}
