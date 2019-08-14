package com.kirago.sc.microserviceconsumermovierfeginhystrixstramfallback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class MicroserverConsumerMovieRibbonApplication {


    public static void main(String[] args) {
        SpringApplication.run(MicroserverConsumerMovieRibbonApplication.class, args);
    }
}
