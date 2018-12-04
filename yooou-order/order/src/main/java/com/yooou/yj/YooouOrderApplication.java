package com.yooou.yj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class YooouOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(YooouOrderApplication.class, args);
    }
}
