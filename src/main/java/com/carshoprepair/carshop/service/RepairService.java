package com.carshoprepair.carshop.service;

import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.domain.Repair;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface RepairService {

    List<Repair> findAll();

    List<Repair> findByPerson(Person person);

    List<Repair> findByDate(Date date);





}
