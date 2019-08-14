package com.kirago.sc.microserviceconsumermovierfeginhystrix.component;

import com.kirago.sc.microserviceconsumermovierfeginhystrix.client.UserFeginClient;
import com.kirago.sc.microserviceconsumermovierfeginhystrix.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class FeginClientFailBack implements UserFeginClient {

    private final static Logger logger = LoggerFactory.getLogger(FeginClientFailBack.class);

    @Override
    public User findById(Long id) {

//        logger.error("进入回退方法", throwable);

        User user = new User();
        user.setId(-1L);
        user.setUsername("默认用户");
        return user;
    }
}
