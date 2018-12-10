package com.carshoprepair.carshop.controller;

import com.carshoprepair.carshop.domain.Owner;
import com.carshoprepair.carshop.service.OwnerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class OwnerController {
    @Autowired
    private OwnerServiceImpl ownerService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/user")
    public String hello(Model model) {
        List<Owner> owner =ownerService.getAllCustomers();
        model.addAttribute("name",owner.toString());
        return "hello";


    }
}
