package com.huey.learning.dubbo.sample.apidocs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.dubbo.apidocs.annotations.ResponseProperty;

import java.io.Serializable;

/**
 * @author huey
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HelloResponse implements Serializable {

    @ResponseProperty(value = "响应编码", example = "0")
    private Integer code;

    @ResponseProperty(value = "响应内容", example = "Hello, Huey!")
    private String content;

}
