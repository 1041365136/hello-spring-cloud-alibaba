package com.ery.nacos.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("nacos-provider")
public interface IConsumerFeign {

    @RequestMapping("sayHi")
    String sayHi();

}
