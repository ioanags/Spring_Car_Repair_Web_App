package com.carshoprepair.carshop.controller.mappers;

import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.models.PersonModel;
import org.springframework.stereotype.Component;

@Component
public class PersonToPersonModelMapper {
    public PersonModel mapToPersonModel(Person person) {
        PersonModel personModel = new PersonModel();
        personModel.setFirstName(person.getFirstName());
        personModel.setLastName(person.getLastName());
        personModel.setEmail(person.getEmail());
        personModel.setPassword(person.getPassword());
        personModel.setAddress(person.getAddress());
        personModel.setCarModel(person.getCarModel());
        personModel.setPlate(person.getPlate());
        personModel.setAfm(person.getAfm());
        personModel.setType(person.getType());
        return personModel;
    }
}
