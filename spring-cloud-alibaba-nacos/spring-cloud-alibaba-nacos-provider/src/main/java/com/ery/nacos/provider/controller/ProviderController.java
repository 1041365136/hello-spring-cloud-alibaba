package com.ery.nacos.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @RequestMapping("sayHi")
    public String sayHi(){
        return "Hello Spring Cloud Nacos Provider";
    }

}
