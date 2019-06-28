package com.springcloud.eurekaconsumerfeign;

import com.springcloud.eurekaclientapi.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {
    @Autowired
    DcClient dcClient;

    @GetMapping("/consumer")
    public String dc(){
        return dcClient.consumer();
    }

    @GetMapping("/feign-consumer")
    public String helloConsumer(){
        StringBuilder bf = new StringBuilder();
        bf.append(dcClient.hello("lpd")).append("\n");
        bf.append(dcClient.hello("liwei",18)).append("\n");
        bf.append(dcClient.hello(new User("niannian",2))).append("\n");
        return bf.toString();
    }
}
