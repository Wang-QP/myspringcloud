package com.wang.userserver.controller;

import com.wang.usermodel.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Value("${server.port:}")
    private String port;

    @GetMapping("/getUser")
    public User getUser(String id) {
        User user = new User();
        user.setId(id);
        user.setUserNo(port);
        return user;
    }
}
