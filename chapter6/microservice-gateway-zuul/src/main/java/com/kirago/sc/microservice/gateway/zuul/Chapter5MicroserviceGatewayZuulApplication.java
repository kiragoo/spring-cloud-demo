package com.kirago.sc.microservice.gateway.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class Chapter5MicroserviceGatewayZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chapter5MicroserviceGatewayZuulApplication.class, args);
    }

}
