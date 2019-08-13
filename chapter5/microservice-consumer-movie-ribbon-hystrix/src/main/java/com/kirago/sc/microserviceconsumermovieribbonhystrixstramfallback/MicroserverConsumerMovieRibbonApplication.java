package com.kirago.sc.microserverconsumermovieribbonhystrixstramfallback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//@EnableHystrix
@EnableCircuitBreaker
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class MicroserverConsumerMovieRibbonApplication {


    public static void main(String[] args) {
        SpringApplication.run(MicroserverConsumerMovieRibbonApplication.class, args);
    }
}
