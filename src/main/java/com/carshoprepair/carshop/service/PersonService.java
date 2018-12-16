package com.carshoprepair.carshop.service;

import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.models.PersonModel;

import java.util.List;


public interface PersonService {
    Person findPersonById(long id);
    List<Person> findAll();
    List<Person> searchByAfmAndEmail(Long afm,String Email);
    void delete(Long id);
    PersonModel create(PersonModel person);
    List<Person> searchByAfm(Long afm);
    List<Person> searchByEmail(String email);





}
