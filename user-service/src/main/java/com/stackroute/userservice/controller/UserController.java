package com.stackroute.userservice.controller;

import com.stackroute.userservice.domain.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    //addconsecutive through url
    @GetMapping("/user/{name}")
    public ResponseEntity<User> getUserDetails(@PathVariable String name){
        logger.debug("Debug");
        logger.info("Info");
        logger.error("Error");
        logger.warn("Warning");
//        log.debug("Debug");
//        log.info("Info");
//        log.error("Error");
//        log.warn("Warning");
        return new ResponseEntity<User>( new User(1,name,20), HttpStatus.OK);
    }
}
