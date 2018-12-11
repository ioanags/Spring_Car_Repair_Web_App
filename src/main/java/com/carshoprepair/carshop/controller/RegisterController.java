package com.carshoprepair.carshop.controller;


import com.carshoprepair.carshop.controller.mappers.RegistrationFormToModelMapper;
import com.carshoprepair.carshop.form.RegisterForm;
import com.carshoprepair.carshop.models.PersonModel;
import com.carshoprepair.carshop.service.PersonServiceImpl;
import com.carshoprepair.carshop.validators.RegisterValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

import static com.carshoprepair.carshop.utils.GlobalAttributes.ERROR_MESSAGE;


@Controller
public class RegisterController {
    private static final String REGISTER_FORM = "registerForm";

   @Autowired
   private PersonServiceImpl personServiceImpl;

   @Autowired
   private RegisterValidator registerValidator;

    @Autowired
    private RegistrationFormToModelMapper mapper;


    @InitBinder(REGISTER_FORM)
    protected void initBinder(final WebDataBinder binder) {binder.addValidators(registerValidator); }


    @GetMapping(value = "/register")
    public String register(Model model) {
        model.addAttribute(REGISTER_FORM,
                new RegisterForm());
        return "create_user";
    }

    @PostMapping(value = "/register")
    public String register(Model model,
                           @Valid @ModelAttribute(REGISTER_FORM)
                                   RegisterForm registerForm,
                           BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            return "create_user";
        }
        PersonModel personModel = mapper.mapToPersonModel(registerForm);
        personServiceImpl.create(personModel);
        return "redirect:/";
    }

}


