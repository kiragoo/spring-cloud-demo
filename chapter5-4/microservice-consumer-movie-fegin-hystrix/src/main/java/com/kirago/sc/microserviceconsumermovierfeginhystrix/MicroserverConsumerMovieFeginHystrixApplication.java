package com.kirago.sc.microserviceconsumermovierfeginhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@EnableHystrix
@SpringBootApplication
@EnableFeignClients
public class MicroserverConsumerMovieFeginHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserverConsumerMovieFeginHystrixApplication.class, args);
    }
}
