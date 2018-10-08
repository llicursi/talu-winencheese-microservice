package com.br.talu.microservices.client.consumer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.net.URI;
import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient

public class EurekaClientApp {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApp.class, args);
    }

    /**
        Looking URI's from other services dinamically
     */
    @Autowired DiscoveryClient client;
    public URI wineServiceUrl(){
        List<ServiceInstance> list = client.getInstances("WINERIES");
        if (list != null && list.size() > 0 ) {
            return list.get(0).getUri();
        }
        return null;
    }
}

