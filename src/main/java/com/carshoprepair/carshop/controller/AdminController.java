package com.carshoprepair.carshop.controller;

import com.carshoprepair.carshop.controller.mappers.SearchFormToModelMapper;
import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.domain.Repair;
import com.carshoprepair.carshop.form.SearchForm;
import com.carshoprepair.carshop.models.PersonModel;
import com.carshoprepair.carshop.service.PersonServiceImpl;
import com.carshoprepair.carshop.service.RepairServiceImpl;
import org.hibernate.annotations.GeneratorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

import static com.carshoprepair.carshop.utils.GlobalAttributes.ERROR_MESSAGE;

@Controller
public class AdminController {
    @Autowired
    private PersonServiceImpl personService;

    @Autowired
    private RepairServiceImpl repairService;


    @GetMapping("/admin")
    public String hello(Model model) {
            List<Repair> repair = repairService.recentRepairs();
            List<Person> person = personService.findAll();
            model.addAttribute("list",repair);
            return "admin_home";

    }

    @GetMapping("/admin/users")
    public String admin_users(Model model){
        List<Person> person = personService.findAll();
        model.addAttribute("list",person);
        return "admin_user_list";
    }




}