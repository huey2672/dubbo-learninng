package com.huey.learning.dubbo.sample.apidocs.provider;

import org.apache.dubbo.apidocs.EnableDubboApiDocs;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubboApiDocs
@SpringBootApplication
public class ApiDocsSampleProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiDocsSampleProviderApplication.class, args);
    }

}
