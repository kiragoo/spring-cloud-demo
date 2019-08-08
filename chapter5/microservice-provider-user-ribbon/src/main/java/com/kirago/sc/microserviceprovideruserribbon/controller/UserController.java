package com.kirago.sc.microserviceprovideruserribbon.controller;

import com.kirago.sc.microserviceprovideruserribbon.entity.User;
import com.kirago.sc.microserviceprovideruserribbon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){

        Optional<User> user = userRepository.findById(id);
        return user.get();
    }
}
