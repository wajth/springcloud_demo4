package com.example.consumer_server_12000.controller;

import com.example.consumer_server_12000.po.User;
import com.example.consumer_server_12000.service.UserFeignClient;
import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import com.example.consumer_server_12000.po.CommonResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/cart")
@CircuitBreaker(name = "backendA", fallbackMethod = "fallback")
public class CartController {
    @Autowired
    private UserFeignClient userFeignClient;
    @GetMapping("/addCart/{userId}")
    public CommonResult<User> addCart(@PathVariable("userId") Integer userId){
       CommonResult<User> list=userFeignClient.getUserById(userId);
       return list;
       }

//    @Bulkhead(name="bulkheadA",fallbackMethod = "fallBack",type=Bulkhead.Type.SEMAPHORE)
//    public CompletableFuture<User> addCart(@PathVariable("userId") Integer userId) throws InterruptedException{
//        System.out.println("进入方法");
////        Thread.sleep(1000L);
//        CompletableFuture<User> result = CompletableFuture.supplyAsync(()->{
//            return userFeignClient.getUserById(userId).getResult();
//        });
//        System.out.println("离开方法");
//        return result;
//    }
//
//    public CompletableFuture<User> fallBack(Integer userId,Throwable e){
//        e.printStackTrace();
//        System.out.println("fallBack已经调用啦！");
//        CompletableFuture<User> result = CompletableFuture.supplyAsync(()->{
//            return new CommonResult<>(400,"当前用户服务不正常，请稍后再试",new User(1,"黄婷婷","123456")).getResult();
//        });
//        return result;
//    }
}