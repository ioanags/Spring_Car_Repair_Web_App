package com.carshoprepair.carshop.controller;

import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class testController {

    @Autowired
    private PersonService personService;



    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public String  getAllCustomers(Model model) {

        List<Person> list = personService.getAllPersons();
        model.addAttribute("list", list);
        return "test";
    }
}
