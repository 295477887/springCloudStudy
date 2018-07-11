package com.chen.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    @RequestMapping(value="/location", method= RequestMethod.GET)
    public String getLocation(){
        logger.info("LocationController 被调用。 ");
        return "地理位置：120.0000,36.2222";
    }

}
