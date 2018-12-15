package com.carshoprepair.carshop.controller.mappers;

import com.carshoprepair.carshop.form.EditForm;
import com.carshoprepair.carshop.form.RegisterForm;
import com.carshoprepair.carshop.models.PersonModel;
import org.springframework.stereotype.Component;

@Component
public class EditFormToModelMapper {

    public PersonModel mapToPersonModel(EditForm editForm) {
        PersonModel personModel = new PersonModel();
        personModel.setFirstName(editForm.getFirstName());
        personModel.setLastName(editForm.getLastName());
        personModel.setEmail(editForm.getEmail());
        personModel.setPassword(editForm.getPassword());
        personModel.setAddress(editForm.getAddress());
        personModel.setCarModel(editForm.getCarModel());
        personModel.setPlate(editForm.getPlate());
        personModel.setAfm(editForm.getAfm());
        personModel.setType(editForm.getType());
        return personModel;
    }
}
