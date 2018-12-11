package com.carshoprepair.carshop.controller;

import com.carshoprepair.carshop.forms.RegisterForm;
import com.carshoprepair.carshop.mappers.RegisterFormToPersonMapper;
import com.carshoprepair.carshop.model.PersonModel;
import com.carshoprepair.carshop.service.PersonService;
import com.carshoprepair.carshop.service.PersonServiceImpl;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RegisterController {
    private static final String REGISTER_FORM = "registerForm";

    @Autowired
    private PersonServiceImpl personService;

    @Autowired
    private RegisterFormToPersonMapper mapper;

    @GetMapping(value = "/register")
    public String register(Model model){
        model.addAttribute(REGISTER_FORM,
                new RegisterForm());
        return "register";
    }

    @PostMapping(value = "/register")
    public String register(Model model,
                           @ModelAttribute(REGISTER_FORM)
                           RegisterForm registerForm){

        PersonModel personModel= mapper.mapToPersonModel(registerForm);
        personService.create(personModel);
        return "redirect:/register";
    }

}
