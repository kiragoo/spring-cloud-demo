package com.kirago.sc.microserviceconsumermovie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
@SpringBootApplication
public class MicroserviceConsumerMovieApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConsumerMovieApplication.class, args);
    }

}
