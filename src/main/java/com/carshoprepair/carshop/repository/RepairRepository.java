package com.carshoprepair.carshop.repository;

import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.domain.Repair;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface RepairRepository extends JpaRepository<Repair,Long> {

    List<Repair> findAll();

    Optional<Repair> findById(Long id);

    List<Repair> findByPerson(Person person);

    List<Repair> findByDate(Date date);

    Repair save(Repair repair);

    void deleteById(Long id);

}
