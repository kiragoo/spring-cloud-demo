package com.kirago.sc.microserviceconsumermovie.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class FeginConfig {

    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }

    @Bean
    public Logger.Level feginLoggerLevel() {

        return Logger.Level.FULL;
    }
}
