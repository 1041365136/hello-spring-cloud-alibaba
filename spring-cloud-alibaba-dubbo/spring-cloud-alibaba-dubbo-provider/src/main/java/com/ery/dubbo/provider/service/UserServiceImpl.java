package com.ery.dubbo.provider.service;

import com.ery.dubbo.api.service.IUserService;
import com.ery.dubbo.entity.User;
import org.apache.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Override
    public List<User> getAllUser() {
        List<User> list = new ArrayList<>();
        list.add(new User().setUsername("hahaha").setPassword("123123").setUid(1));
        list.add(new User().setUsername("wawawa").setPassword("123123").setUid(2));
        list.add(new User().setUsername("xixixi").setPassword("123123").setUid(3));
        return list;
    }

    @Override
    public User getOneUser() {
        return new User().setUsername("hahaha").setPassword("123123").setUid(1);
    }
}
