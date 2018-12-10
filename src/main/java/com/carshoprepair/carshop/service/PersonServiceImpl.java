package com.carshoprepair.carshop.service;

import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> getAllPersons() {return personRepository.findAll();}

    @Override
    public Optional<Person> findPerson(Long id){ return personRepository.findById(id);}

    @Override
    public Optional<Person> getPersonByFirstNameAndLastName(String firstname,String lastname){
        return personRepository.getPersonByFirstNameAndLastName(firstname,lastname);
    }

}
