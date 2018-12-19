package com.carshoprepair.carshop.repository;

import com.carshoprepair.carshop.domain.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;


@Repository
public interface PersonJPARepository extends JpaRepository<Person,Long> {

    Person findPersonById(long id);
    List<Person> findPersonByEmail(String email);
    List<Person> findPersonByAfmAndEmail(Long afm, String Email);
    List<Person> findPersonByAfm(Long Afm);
    Person findPersonByPlate(String plate);


    Person save(Person person);



}
