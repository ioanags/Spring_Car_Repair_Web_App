package com.carshoprepair.carshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hello {

    @GetMapping("/hello")
    public String hello(){

        return "hello";
    }

    @GetMapping("/login")
    public String login(){

        return "LogIn";
    }



}
