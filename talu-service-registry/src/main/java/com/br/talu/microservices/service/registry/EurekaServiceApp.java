package com.br.talu.microservices.service.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class EurekaServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApp.class, args);
    }

}