package com.yuzh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetflixApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(NetflixApplication2.class, args);
    }
}
