package gateway_server_14000.controller;

import gateway_server_14000.po.CommonResult;
import gateway_server_14000.po.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerServicefalback {
    @RequestMapping(value = "/fallback",method = RequestMethod.GET)
    public CommonResult GetCommomRse(){
        return new CommonResult<>(403,"由于ConsumerService异常进行服务",new User(1,"张三","123456"));
    }
}