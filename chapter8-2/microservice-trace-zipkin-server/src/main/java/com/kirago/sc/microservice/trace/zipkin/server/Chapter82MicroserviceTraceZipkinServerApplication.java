package com.kirago.sc.microservice.trace.zipkin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class Chapter82MicroserviceTraceZipkinServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chapter82MicroserviceTraceZipkinServerApplication.class, args);
    }

}
