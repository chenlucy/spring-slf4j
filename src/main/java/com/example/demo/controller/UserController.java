package com.example.demo.controller;

import com.example.demo.exception.GlobalExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.GarbageCollectorMXBean;

/**
 * @Describe
 * @Author Corey
 * @Date 2018/7/4.
 */
@RestController
public class UserController {

    private static Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    private static Logger log = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/test")
    public String test(){
        log.trace("trace");
        log.debug("debug");
        log.info("info");
        log.error("error");
        log.warn("warn");


        return "test";
    }
}
