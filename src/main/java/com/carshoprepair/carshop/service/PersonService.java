package com.carshoprepair.carshop.service;

import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.models.PersonModel;

import java.util.List;


public interface PersonService {
    Person findPersonById(long id);
    List<Person> findAll();
    List<PersonModel> searchByAfmAndEmail(Long afm,String Email);
    void delete(Long id);
    PersonModel create(PersonModel person);
    List<PersonModel> searchByAfm(Long afm);
    List<PersonModel> searchByEmail(String email);





}
