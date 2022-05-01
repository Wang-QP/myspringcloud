package com.wang.userserver.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/v1/nacos")
@RestController
public class NacosController {

    private final DiscoveryClient discoveryClient;

    @GetMapping("/get")
    public String get(){
        List<ServiceInstance> instances = discoveryClient.getInstances("cloud-system-service");
        ServiceInstance serviceInstance = instances.get(0);
        // 获取到nacos注册中心上的服务ip以及端口
        String host = serviceInstance.getHost();
        int port = serviceInstance.getPort();
        return host+":"+port;
    }
}

