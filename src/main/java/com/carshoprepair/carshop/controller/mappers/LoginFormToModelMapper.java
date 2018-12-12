package com.carshoprepair.carshop.controller.mappers;


import com.carshoprepair.carshop.form.LoginForm;
import com.carshoprepair.carshop.models.PersonModel;
import org.springframework.stereotype.Component;

@Component
public class LoginFormToModelMapper {

    public PersonModel mapToPersonModel2(LoginForm loginForm){
        PersonModel personModel = new PersonModel();

        personModel.setEmail(loginForm.getEmail());
        personModel.setPassword(loginForm.getPassword());

        return personModel;
    }





}
