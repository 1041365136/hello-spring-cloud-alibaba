package com.ery.dubbo.consumer.controller;

import com.ery.dubbo.api.service.IUserService;
import com.ery.dubbo.entity.User;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DubboConsumerController {

    @Reference
    private IUserService userService;

    @RequestMapping("getAll")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @RequestMapping("getOne")
    public User getOneUser(){
        return userService.getOneUser();
    }

}
