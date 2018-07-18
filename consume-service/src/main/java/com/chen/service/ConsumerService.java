package com.chen.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author: ChenJie
 * @date 2018/7/18
 */
@Service
public class ConsumerService {
    Logger logger = LoggerFactory.getLogger(ConsumerService.class);

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public String consumeLocation(){
        return restTemplate.getForObject("http://location-service/location", String.class);
    }

    public String fallback(){
        logger.info("fallback");
        return "server is down!";
    }


}
