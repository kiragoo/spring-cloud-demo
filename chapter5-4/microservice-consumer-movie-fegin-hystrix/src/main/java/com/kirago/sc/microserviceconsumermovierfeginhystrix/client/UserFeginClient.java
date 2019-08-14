package com.kirago.sc.microserviceconsumermovierfeginhystrix.client;

import com.kirago.sc.microserviceconsumermovierfeginhystrix.component.FeginClientFailBack;
import com.kirago.sc.microserviceconsumermovierfeginhystrix.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "microservice-provider-user",fallback = FeginClientFailBack.class)
public interface UserFeginClient {

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);
}
