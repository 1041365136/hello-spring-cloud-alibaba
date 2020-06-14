package com.ery.nacos.consumer.service;

import com.ery.nacos.consumer.service.fallback.ConsumerFeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "nacos-provider",fallback = ConsumerFeignFallback.class)
public interface IConsumerFeign {

    @RequestMapping("sayHi")
    String sayHi();

}
