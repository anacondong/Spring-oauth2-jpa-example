package com.github.arocketman.controllers;

import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @GetMapping(value = "/")
    public String index(){
        return "Hello world";
    }
    
    @GetMapping(value = "/private")
    public String privateHome(){
        return "Private Zone";
    }

}
