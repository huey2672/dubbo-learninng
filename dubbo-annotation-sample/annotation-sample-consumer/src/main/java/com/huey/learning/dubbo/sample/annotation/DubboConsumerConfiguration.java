package com.huey.learning.dubbo.sample.annotation;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableDubbo(scanBasePackages = "com.huey.learning.dubbo.sample.annotation")
@PropertySource("classpath:/dubbo.properties")
@ComponentScan(value = {"com.huey.learning.dubbo.sample.annotation"})
public class DubboConsumerConfiguration {

}