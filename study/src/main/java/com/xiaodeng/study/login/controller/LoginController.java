package com.xiaodeng.study.login.controller;

import com.xiaodeng.study.login.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/study/login")
@Slf4j
public class LoginController {
    @Autowired
    private LoginService loginService;

    @GetMapping("/getUserById")
    public void getUserById(@RequestParam("id") Integer id){
       // log.info("12345678==================");
        loginService.getUserById(id);
    }
}
