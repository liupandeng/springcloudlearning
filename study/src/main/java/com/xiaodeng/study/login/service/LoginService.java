package com.xiaodeng.study.login.service;

import com.xiaodeng.study.login.beans.User;
import com.xiaodeng.study.login.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private UserMapper userMapper;

    public void getUserById(Integer id) {

       User user = userMapper.getUserById(id);
       System.out.println(user);
    }
}
