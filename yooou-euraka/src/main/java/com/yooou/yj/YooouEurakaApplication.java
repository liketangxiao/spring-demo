package com.yooou.yj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class YooouEurakaApplication {

    public static void main(String[] args) {
        SpringApplication.run(YooouEurakaApplication.class, args);
    }
}
