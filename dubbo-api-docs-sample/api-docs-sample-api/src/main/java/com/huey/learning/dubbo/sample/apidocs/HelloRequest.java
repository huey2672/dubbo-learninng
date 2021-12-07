package com.huey.learning.dubbo.sample.apidocs;

import lombok.Data;
import org.apache.dubbo.apidocs.annotations.RequestParam;

import java.io.Serializable;

/**
 * @author huey
 */
@Data
public class HelloRequest implements Serializable {

    @RequestParam(value = "名字", required = true, example = "Huey")
    private String name;

}
