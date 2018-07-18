package com.chen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author: ChenJie
 * @date 2018/7/18
 */
@Service
public class ConsumerService {
    @Autowired
    private RestTemplate restTemplate;

    public String consumeLocation(){
        return restTemplate.getForObject("http://location-service/location", String.class);
    }
}
