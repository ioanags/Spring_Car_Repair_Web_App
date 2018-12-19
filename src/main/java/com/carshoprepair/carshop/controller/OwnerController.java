package com.carshoprepair.carshop.controller;

import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.domain.Repair;
import com.carshoprepair.carshop.repository.PersonJPARepository;
import com.carshoprepair.carshop.service.PersonServiceImpl;
import com.carshoprepair.carshop.service.RepairServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class OwnerController {

    @Autowired
    private RepairServiceImpl repairService;

    @Autowired
    private PersonJPARepository personJPARepository;


    @GetMapping(value = "/owner")
    public String owner_home(Model model){

        //Get Users Lastname
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        model.addAttribute("lastname",name);

        Person person = personJPARepository.findPersonByLastName(name);
        List<Repair> repairs = person.getRepairs();


        model.addAttribute("list", repairs);

        return "owner_home";

    }
}
