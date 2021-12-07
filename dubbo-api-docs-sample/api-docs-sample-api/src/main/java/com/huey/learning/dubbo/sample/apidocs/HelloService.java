package com.huey.learning.dubbo.sample.apidocs;

import org.apache.dubbo.apidocs.annotations.ApiModule;

/**
 * @author huey
 */
public interface HelloService {

    HelloResponse sayHello(HelloRequest request);

}
