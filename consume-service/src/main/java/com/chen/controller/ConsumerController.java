package com.chen.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: ChenJie
 * @date 2018/7/11
 */
@RestController
public class ConsumerController {
    private final Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value="/consumeLocation",method= RequestMethod.GET)
    public String consumeLocation(){
        logger.info("consumeLocation 服务被调用。");
        return restTemplate.getForObject("http://location-service/location", String.class);
    }

}
