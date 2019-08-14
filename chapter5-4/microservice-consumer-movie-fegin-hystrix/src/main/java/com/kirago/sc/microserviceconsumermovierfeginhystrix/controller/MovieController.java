package com.kirago.sc.microserviceconsumermovierfeginhystrix.controller;

import com.kirago.sc.microserviceconsumermovierfeginhystrix.client.UserFeginClient;
import com.kirago.sc.microserviceconsumermovierfeginhystrix.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MovieController.class);

    @Autowired
    private UserFeginClient userFeginClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){

        return userFeginClient.findById(id);
    }

}
