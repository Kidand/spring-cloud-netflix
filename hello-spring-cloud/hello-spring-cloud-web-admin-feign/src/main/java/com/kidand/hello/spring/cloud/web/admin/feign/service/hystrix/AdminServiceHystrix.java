package com.kidand.hello.spring.cloud.web.admin.feign.service.hystrix;

import com.kidand.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

@Component//配合熔断器
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {
        return String.format("Hi,your message is : %s but request is bad",message);
    }
}
