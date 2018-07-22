package com.br.talu.microservices;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient()

public class EurekaClientApp {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApp.class, args);
    }
}

@RestController
class ServiceInstanceRestController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/service-instances/{applicationName}")
    public List<ServiceInstance> serviceInstances(
            @PathVariable String applicationName) {
        return this.discoveryClient.getInstances(applicationName);
    }

    @RequestMapping("/home")
    public String home() {
        return "Hello! You are on my home page!";
    }

    @RequestMapping("/info")
    public String info() {
        return "You are connecting to the winencheese consumer, here you can log in you favorite " +
                "Wines and Cheeses!";
    }

    @RequestMapping("/consume")
    public String consume() {
        return "Need to connect to Lu microservice";
    }
}

