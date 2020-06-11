package com.ery.dubbo.api.service;

import com.ery.dubbo.entity.User;

import java.util.List;

public interface IUserService {

    List<User> getAllUser();

    User getOneUser();

}
