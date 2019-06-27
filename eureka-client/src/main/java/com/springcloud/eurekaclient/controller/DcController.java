package com.springcloud.eurekaclient.controller;

import com.springcloud.eurekaclient.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

@RestController
public class DcController {
    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() throws InterruptedException {
        //Hystrix 默认超时时间是2000毫秒，可以触发断路器
        //Thread.sleep(5000L);
        String services = "services:"+discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

    @GetMapping("/hello1")
    public String hello(@RequestParam String name){
        return "RequestParam: hello "+name;
    }

    @GetMapping("/hello2")
    public User hello(@RequestHeader String name,@RequestHeader Integer age){
        return new User(name,age);
    }
    @PostMapping("/hello3")
    public String hello(@RequestBody User user){
        return "RequestBody: hello " + user.getName()+","+user.getAge();
    }
}
