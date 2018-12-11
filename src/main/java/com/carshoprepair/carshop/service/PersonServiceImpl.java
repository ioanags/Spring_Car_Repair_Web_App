package com.carshoprepair.carshop.service;

import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.mappers.PersonToPersonModelMapper;
import com.carshoprepair.carshop.model.PersonModel;
import com.carshoprepair.carshop.repository.PersonJPARepository;
import com.carshoprepair.carshop.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonJPARepository jpaRepository;

    @Autowired
    private PersonToPersonModelMapper personMapper;

    @Override
    public List<Person> getAllPersons() {return jpaRepository.findAll();}

    @Override
    public Optional<Person> findPerson(Long id){ return jpaRepository.findById(id);}

    @Override
    public Optional<Person> getPersonByFirstNameAndLastName(String firstname,String lastname){
        return jpaRepository.getPersonByFirstNameAndLastName(firstname,lastname);
    }

    @Override
    public PersonModel create(PersonModel personModel){
        Person person = new Person(personModel.getFirstName(),personModel.getLastName(),personModel.getAddress(),personModel.getEmail(),personModel.getPassword(),personModel.getType(),personModel.getAfm());
        Person savedPerson = jpaRepository.save(person);
        return personMapper.mapToPersonModel(savedPerson);
    }


}
