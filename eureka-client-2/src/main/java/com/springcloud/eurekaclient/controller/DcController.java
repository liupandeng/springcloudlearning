package com.springcloud.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
