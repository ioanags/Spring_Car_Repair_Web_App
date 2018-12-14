package com.carshoprepair.carshop.service;

import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.domain.Repair;

import java.util.Date;
import java.util.List;

public interface RepairService  {
    List<Repair> findRepairByPerson(Person person);
    List<Repair> findAll();
    List<Repair> recentRepairs();

    void delete(Long id);



}
