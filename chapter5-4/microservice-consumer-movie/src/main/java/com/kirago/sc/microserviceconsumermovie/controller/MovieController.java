package com.kirago.sc.microserviceconsumermovie.controller;

import com.kirago.sc.microserviceconsumermovie.config.FeginConfig;
import com.kirago.sc.microserviceconsumermovie.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    private static final Logger logger = LoggerFactory.getLogger(MovieController.class);

    @Autowired
    private FeginConfig feginConfig;

    @HystrixCommand(fallbackMethod = "findByIdFallback")
    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){


//        return this.feginConfig.restTemplate().getForObject("http://microservice-provider-user/" + id, User.class);
        return this.feginConfig.restTemplate().getForObject("http://127.0.0.1:8001/" + id, User.class);
    }

    public User findByIdFallback(Long id, Throwable throwable) {

        logger.error("默认进入回退", throwable);

        User user = new User();
        user.setId(-1L);
        user.setName("默认用户");
        return user;
    }
}
