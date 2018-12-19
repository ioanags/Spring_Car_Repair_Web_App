package com.carshoprepair.carshop.repository;

import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.domain.Repair;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.time.LocalDateTime;

import java.util.List;


@Repository
public interface RepairJPARepository extends JpaRepository<Repair,Long> {
    List<Repair> findRepairByPerson(Person person);
    List<Repair> findTop10ByOrderByDateAsc();

    Repair findRepairById(long id);

   List<Repair> findByDate(LocalDateTime date);




}
