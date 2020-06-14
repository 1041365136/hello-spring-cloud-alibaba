package com.ery.nacos.consumer.service.fallback;

import com.ery.nacos.consumer.service.IConsumerFeign;
import org.springframework.stereotype.Component;

@Component
public class ConsumerFeignFallback implements IConsumerFeign {
    @Override
    public String sayHi() {
        return "请求失败，检查网络";
    }
}
