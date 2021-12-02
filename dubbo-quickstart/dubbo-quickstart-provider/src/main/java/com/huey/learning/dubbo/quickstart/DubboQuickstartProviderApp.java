package com.huey.learning.dubbo.quickstart;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author huey
 */
public class DubboQuickstartProviderApp {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-provider.xml");
        context.start();
        // 按任意键退出
        System.in.read();
        context.stop();
    }

}
