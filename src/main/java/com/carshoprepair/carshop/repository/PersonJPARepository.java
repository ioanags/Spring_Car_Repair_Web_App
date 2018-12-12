package com.carshoprepair.carshop.repository;

import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.models.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonJPARepository extends JpaRepository<Person,Long> {

    Optional<Person> findPersonById(long id);
    Optional<Person> findPersonByEmail(String email);
    Optional<Person> findPersonByEmailAndPassword(String email,String password);

}
