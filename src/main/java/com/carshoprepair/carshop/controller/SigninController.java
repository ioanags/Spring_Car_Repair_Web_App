package com.carshoprepair.carshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SigninController {

    @GetMapping(value = "/login")
    private String login(){
        return "login";
    }


}
