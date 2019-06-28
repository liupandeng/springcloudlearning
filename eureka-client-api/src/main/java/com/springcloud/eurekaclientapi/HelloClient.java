package com.springcloud.eurekaclientapi;

import com.springcloud.eurekaclientapi.User;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/helloclient")
public interface HelloClient {

    @GetMapping("/dc")
    String consumer();

    @GetMapping("/hello1")
     String hello(@RequestParam("name") String name);

    @GetMapping("/hello2")
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @PostMapping("/hello3")
     String hello(@RequestBody User user);
}
