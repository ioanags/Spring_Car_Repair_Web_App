package com.carshoprepair.carshop.repository;

import com.carshoprepair.carshop.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonJPARepository extends JpaRepository<Person,Long> {

    Optional<Person> getPersonByFirstNameAndLastName(String firstName, String lastName);
}
