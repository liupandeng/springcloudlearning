package com.springcloud.eurekaclient.controller;

import com.springcloud.eurekaclientapi.User;
import com.springcloud.eurekaclientapi.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController implements HelloClient {
    @Autowired
    DiscoveryClient discoveryClient;

    @Override
    public String consumer() {
        String services = "services:"+discoveryClient.getServices();
        System.out.println(services);
        return services;

    }

    @Override
    public String hello(String name) {
        return "RequestParam: hello "+name;
    }

    @Override
    public User hello(String name, Integer age) {
        return new User(name,age);
    }

    @Override
    public String hello(User user) {
        return "RequestBody: hello " + user.getName()+","+user.getAge();
    }

}
