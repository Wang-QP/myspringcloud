package com.wang.userclient.client;

import com.wang.usermodel.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "user-service", contextId = "user")
public interface UserClient {
    @GetMapping("/user/getUser")
    User getUser(@RequestParam("id") String id);
}
