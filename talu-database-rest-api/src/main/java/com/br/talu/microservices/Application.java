package com.br.talu.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient()
public class Application {

    public static void main(String[] args)  {
        SpringApplication.run(Application.class, args);
        System.out.println("My server is on!");
    }

}
