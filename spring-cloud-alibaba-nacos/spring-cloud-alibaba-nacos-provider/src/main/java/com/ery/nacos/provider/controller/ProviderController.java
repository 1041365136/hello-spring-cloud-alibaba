package com.ery.nacos.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ProviderController {

    @RequestMapping("sayHi")
    public String sayHi(){
        log.debug("provider 返回了字符串");
        return "Hello Spring Cloud Nacos Provider";
    }

}
