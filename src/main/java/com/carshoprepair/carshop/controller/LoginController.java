package com.carshoprepair.carshop.controller;


import com.carshoprepair.carshop.controller.mappers.LoginFormToModelMapper;
import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.form.LoginForm;
import com.carshoprepair.carshop.models.PersonModel;
import com.carshoprepair.carshop.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class LoginController {

    @Autowired
    private PersonServiceImpl personService;

    @Autowired
    private LoginFormToModelMapper mapper;

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return "login";
    }



    @PostMapping("/login")
    public String login(Model model,
                        @Valid @ModelAttribute("loginForm")
                        LoginForm loginForm){

        PersonModel personModel = mapper.mapToPersonModel(loginForm);
        Optional<Person> person = personService.findPersonByEmailAndPassword(personModel.getEmail(),personModel.getPassword());
        if(person.isPresent()){
            return "redirect:/register";
        }else {
            return "FailToLogin";
        }

    }





}
