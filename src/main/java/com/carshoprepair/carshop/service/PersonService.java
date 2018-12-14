package com.carshoprepair.carshop.service;

import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.models.PersonModel;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    Optional<Person> findPersonById(long id);
    List<Person> findAll();

    Optional<Person> findPersonByEmailAndPassword(String email, String password);
    List<Person> searchByAfmOrEmail(long afm,String Email);

    PersonModel create(PersonModel person);


}
