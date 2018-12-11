package com.carshoprepair.carshop.mappers;

import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.model.PersonModel;
import org.springframework.stereotype.Component;

@Component
public class PersonToPersonModelMapper {

    public PersonModel mapToPersonModel(Person person){
        PersonModel personModel = new PersonModel();
        personModel.setId(person.getId());
        personModel.setFirstName(person.getFirstName());
        personModel.setLastName(person.getLastName());
        personModel.setEmail(person.getEmail());
        personModel.setAfm(person.getAfm());
        personModel.setPassword(person.getPassword());
        personModel.setAddress(personModel.getAddress());
        personModel.setType(person.getType());

        return personModel;

    }
}
