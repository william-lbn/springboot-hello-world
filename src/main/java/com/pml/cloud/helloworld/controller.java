package com.pml.cloud.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author： libin
 * @email： 909445583@qq.com
 * @date： 2023/4/14
 * @description：
 * @modifiedBy：
 * @version: 1.0
 */
@RestController
public class controller {

    @GetMapping(value = "/hello-world")
    public String hello_world(){
        return "hello world. I am ok.";
    }

}
