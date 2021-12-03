package com.huey.learning.dubbo.sample.spi.filter;

import org.apache.dubbo.common.logger.Logger;
import org.apache.dubbo.common.logger.LoggerFactory;
import org.apache.dubbo.rpc.Filter;
import org.apache.dubbo.rpc.Invocation;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.Result;
import org.apache.dubbo.rpc.RpcException;

import java.util.Arrays;

/**
 * @author huey
 */
public class MyConsumerFilter implements Filter {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyConsumerFilter.class);

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {

        String interfaceName = invoker.getInterface().getName();
        Object[] arguments = invocation.getArguments();
        LOGGER.info("服务消费方开始调用服务：" + interfaceName + ", 参数列表：" + Arrays.asList(arguments));

        Result result = invoker.invoke(invocation);

        Object value = result.getValue();
        LOGGER.info("服务消费方结束调用服务：" + interfaceName + ", 返回值：" + value);

        return result;

    }

}
