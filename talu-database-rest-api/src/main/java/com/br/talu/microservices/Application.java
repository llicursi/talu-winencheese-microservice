package com.br.talu.microservices;

import com.br.talu.microservices.dbrest.WineRepository;
import com.br.talu.microservices.models.wine.GrapeType;
import com.br.talu.microservices.models.wine.Wine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

@SpringBootApplication
@EnableDiscoveryClient()
public class Application {

    public static void main(String[] args)  {
        SpringApplication.run(Application.class, args);
        System.out.println("My server is on!");
    }


    @PostConstruct
    @Transactional
    public void onLoad(){

    }

}
