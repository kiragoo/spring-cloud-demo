package com.kirago.sc.microserviceconsumermovie.component;

import com.kirago.sc.microserviceconsumermovie.client.UserFeginClient;
import com.kirago.sc.microserviceconsumermovie.entity.User;
import org.springframework.stereotype.Component;

@Component
public class FeginClientFailBack implements UserFeginClient {

    @Override
    public User findById(Long id) {
        User user = new User();
        user.setId(-1L);
        user.setUsername("默认用户");
        return user;
    }
}
