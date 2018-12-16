package com.carshoprepair.carshop.repository;

import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.form.EditForm;
import com.carshoprepair.carshop.models.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public interface PersonJPARepository extends JpaRepository<Person,Long> {

    Person findPersonById(long id);
    List<Person> findPersonByEmail(String email);
    List<Person> findPersonByAfmAndEmail(Long afm, String Email);
    List<Person> findPersonByAfm(Long Afm);
    Optional<Person> findById(Long id);
    Person save(Person person);



}
