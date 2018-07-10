package com.chen.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: ChenJie
 * @date 2018/7/10
 */
@RestController
public class LocationController {
    private final Logger logger = LoggerFactory.getLogger(LocationController.class);

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value="/location", method= RequestMethod.GET)
    public String getLocation(){
        ServiceInstance localServiceInstance = client.getLocalServiceInstance();
        logger.info("location ,host: "+localServiceInstance.getHost()+" , serviceId:"+localServiceInstance.getServiceId());
        return "120.0000,36.2222";
    }

}
