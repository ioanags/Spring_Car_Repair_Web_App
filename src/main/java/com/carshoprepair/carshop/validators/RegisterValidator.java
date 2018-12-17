package com.carshoprepair.carshop.validators;

import com.carshoprepair.carshop.form.RegisterForm;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class RegisterValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {

        return RegisterForm.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {

        RegisterForm registerForm = (RegisterForm) target;

        //here perform your checks
        if (registerForm.getAfm() == 0) {
            // add an error for the field called ‘email’
            errors.rejectValue("afm", "email is empty");}
//        }else if(registerForm.getAfm() == 0){
//            errors.rejectValue("afm","afm is empty");
//        }else if (registerForm.getPlate() == null){
//            errors.rejectValue("plate","plate is empty");
//        }else if (registerForm.getLastName() == null){
//            errors.rejectValue("lastName","Last name is empty");
//        }else if(registerForm.getPassword() == null){
//            errors.rejectValue("password","Password is empty");
//        }else if(registerForm.getType() == null){
//            errors.rejectValue("type","type is empty");
//        }

        ValidationUtils.rejectIfEmpty(errors, "firstName", "firstName.empty");
    }

}
