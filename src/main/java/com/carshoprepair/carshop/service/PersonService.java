package com.carshoprepair.carshop.service;

import com.carshoprepair.carshop.domain.Person;

import java.util.List;
import java.util.Optional;

public interface   PersonService {

    Optional<Person> findPerson(Long id);

    List<Person> getAllPersons();

    Optional<Person> getPersonByFirstNameAndLastName(String firstname,String lastname);


}
