package com.br.talu.microservices.service.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy

public class ZuulServiceGateway {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServiceGateway.class, args);
    }

    /*@Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder().username("user").password("password").roles("USER")
                .build();
        return new InMemoryUserDetailsManager(user);
    }*/
}
