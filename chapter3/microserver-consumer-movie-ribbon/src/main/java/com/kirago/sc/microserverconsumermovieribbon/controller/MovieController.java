package com.kirago.sc.microserverconsumermovieribbon.controller;

import com.kirago.sc.microserverconsumermovieribbon.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MovieController.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;


    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        User user = new User();
        try{
           user =  restTemplate.getForObject("http://microservice-provider-user-ribbon/" + id, User.class);
           return user;
        }catch (Exception e){
            LOGGER.debug(">>>>>>>>>>>>>>>>>");
            e.printStackTrace();
            LOGGER.debug("<<<<<<<<<<<<<<<<");
        }
        return restTemplate.getForObject("http://microservice-provider-user-ribbon/" + id, User.class);
    }

    @GetMapping("/log-user-instance")
    public void logUserInstance() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("microservice-provider-user-ribbon");

        MovieController.LOGGER.info("=====ServiceId:{},ServiceHost:{}.ServicePort:{}===", serviceInstance.getServiceId(), serviceInstance.getHost(), serviceInstance.getPort());
    }
}
