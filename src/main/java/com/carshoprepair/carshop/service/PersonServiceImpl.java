package com.carshoprepair.carshop.service;

import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.repository.PersonJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonJPARepository personJPARepository;
    @Override
    public Optional<Person> getPersonById(long id) {
       return personJPARepository.findPersonById(id);
    }
    public Optional<Person> getPersonByEmail(String email){
        return personJPARepository.findPersonByEmail(email);
    }

    @Override
    public Optional<Person> findPersonByType(String type) {
        return Optional.empty();
    }
}
