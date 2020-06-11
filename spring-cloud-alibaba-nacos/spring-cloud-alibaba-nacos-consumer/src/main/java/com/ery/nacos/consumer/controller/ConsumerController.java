package com.ery.nacos.consumer.controller;

import com.ery.nacos.consumer.service.IConsumerFeign;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConsumerController {

    @Resource
    private IConsumerFeign consumerFeign;

    @RequestMapping("getHi")
    public String getHi(){
        return consumerFeign.sayHi();
    }

}
