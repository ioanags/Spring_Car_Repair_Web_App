package com.carshoprepair.carshop.service;

import com.carshoprepair.carshop.domain.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    Optional<Person> getPersonById(long id);
    Optional<Person> getPersonByEmail(String email);

    Optional<Person> findPersonByType(String type);
}
