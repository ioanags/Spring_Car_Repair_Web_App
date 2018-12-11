package com.carshoprepair.carshop.controller;

import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.service.PersonServiceImpl;
import com.carshoprepair.carshop.service.RepairServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class PersonController {
    @Autowired
    private PersonServiceImpl personService;

    @Autowired
    private RepairServiceImpl repairService;
    @GetMapping("/admin")

    public String index() {

        return "login";
    }
    @GetMapping("/hello")

    public String hello(Model model, @RequestParam(value = "id") long id) {
       Optional<Person> user = personService.findPersonById(id);
            user.ifPresent(person ->model.addAttribute("name",person.getFirstName()));
            user.ifPresent(person ->model.addAttribute("surname",person.getLastName()));
            List<Person> person = personService.findAll();
            model.addAttribute("list",person);
            return "hello";

    }
}
