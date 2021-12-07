package com.huey.learning.dubbo.sample.apidocs.provider;

import com.huey.learning.dubbo.sample.apidocs.HelloRequest;
import com.huey.learning.dubbo.sample.apidocs.HelloResponse;
import com.huey.learning.dubbo.sample.apidocs.HelloService;
import org.apache.dubbo.apidocs.annotations.ApiDoc;
import org.apache.dubbo.apidocs.annotations.ApiModule;
import org.apache.dubbo.apidocs.annotations.RequestParam;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
@ApiModule(value = "问好模块", apiInterface = HelloService.class)
public class HelloServiceImpl implements HelloService {

    @Override
    @ApiDoc(value = "打招呼")
    public HelloResponse sayHello(@RequestParam("请求") HelloRequest request) {
        return new HelloResponse(0, "Hello, " + request.getName());
    }

}