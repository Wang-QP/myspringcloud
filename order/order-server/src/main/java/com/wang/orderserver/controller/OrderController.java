package com.wang.orderserver.controller;

import com.wang.userclient.client.UserClient;
import com.wang.usermodel.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    private UserClient userClient;

    @GetMapping("/getUser")
    public User getUser(String id) {
        return userClient.getUser(id);
    }
}
