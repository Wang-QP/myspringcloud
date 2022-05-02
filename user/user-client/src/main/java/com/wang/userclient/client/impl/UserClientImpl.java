package com.wang.userclient.client.impl;

import com.wang.userclient.client.UserClient;
import com.wang.usermodel.User;
import org.springframework.stereotype.Component;

@Component
public class UserClientImpl implements UserClient {
    @Override
    public User getUser(String id) {
        System.out.println("111111");
        return null;
    }
}
