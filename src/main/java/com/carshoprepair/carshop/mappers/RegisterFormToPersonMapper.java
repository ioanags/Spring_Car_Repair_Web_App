package com.carshoprepair.carshop.mappers;

import com.carshoprepair.carshop.forms.RegisterForm;
import com.carshoprepair.carshop.model.PersonModel;
import org.springframework.stereotype.Component;

@Component
public class RegisterFormToPersonMapper {

    public PersonModel mapToPersonModel(RegisterForm registerForm){
        PersonModel personModel = new PersonModel();
        personModel.setId(registerForm.getPerson_id());
        personModel.setFirstName(registerForm.getFirstname());
        personModel.setLastName(registerForm.getLastname());
        personModel.setEmail(registerForm.getEmail());
        personModel.setAfm(registerForm.getAfm());
        personModel.setPassword(registerForm.getPassword());
        personModel.setAddress(registerForm.getAddress());
        personModel.setType(registerForm.getType());

        return personModel;
    }
}
