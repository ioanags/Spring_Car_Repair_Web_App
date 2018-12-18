package com.carshoprepair.carshop.controller;

import com.carshoprepair.carshop.domain.Repair;
import com.carshoprepair.carshop.service.RepairServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class OwnerController {

    @Autowired
    private RepairServiceImpl repairService;

    @GetMapping(value = "/owner")
    public String owner_home(Model model){
        List<Repair> repair = repairService.recentRepairs();
        model.addAttribute("list",repair);

        return "owner_home";

    }
}
