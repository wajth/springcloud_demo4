package com.example.provider_server_11000.controller;

import com.example.provider_server_11000.po.CommonResult;
import com.example.provider_server_11000.po.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RefreshScope //开启动态刷新
public class UserController {
    //获取配置信息中的name属性值
    @Value("${msg}")
    private String msg;

    @GetMapping("/getUserById/{userId}")
    public CommonResult<User> getUserById(@PathVariable("userId") Integer userId){
        //模拟返回业务数据
        return new CommonResult(200,"success(11001)(msg:"+msg+")",new User(userId,"张三","123"));
    }
}
