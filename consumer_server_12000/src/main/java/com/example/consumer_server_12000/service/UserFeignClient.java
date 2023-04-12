package com.example.consumer_server_12000.service;

import com.example.consumer_server_12000.po.CommonResult;
import com.example.consumer_server_12000.po.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="provider-server")
public interface UserFeignClient {
    //配置需要调用的挂号服务接口。与UserController中的方法定义一致
    @GetMapping("/user/getUserById/{userId}")
    CommonResult<User> getUserById(@PathVariable("userId") Integer userId);
}

