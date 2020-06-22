package com.ery.nacos.consumer.controller;

import com.ery.nacos.consumer.service.IConsumerFeign;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api("消费者相关接口")
@RestController
public class ConsumerController {

    @Resource
    private IConsumerFeign consumerFeign;

    @ApiOperation(value = "欢迎的接口", httpMethod = "GET")
    @ApiResponse(code = 200, message = "成功", response = String.class)
    @ApiImplicitParam(name = "name", value = "你的名字", required = true, dataType = "String", example = "Trump")
    @RequestMapping("getHi")
    public String getHi(String name) {
        return consumerFeign.sayHi() + ":" + name;
    }

}
