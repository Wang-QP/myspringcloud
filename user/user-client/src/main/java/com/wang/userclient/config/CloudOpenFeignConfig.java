package com.wang.userclient.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class CloudOpenFeignConfig {

    /**
     * 日志级别定义
     * import feign.Logger;
     */
    @Profile("dev")
    @Bean
    Logger.Level feginLoggerLevel(){
        System.out.println("feign logger loading...");
        return Logger.Level.FULL;
    }

}
