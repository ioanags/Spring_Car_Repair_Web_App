package com.carshoprepair.carshop.service;

import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.domain.Repair;
import com.carshoprepair.carshop.repository.RepairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class RepairServiceImpl implements RepairService {

    @Autowired
    private RepairRepository repairRepository;

    @Override
    public List<Repair> findAll(){return repairRepository.findAll();}

    @Override
    public List<Repair> findByPerson(Person person){return repairRepository.findByPerson(person);}

    @Override
    public  List<Repair>  findByDate(Date date) {return repairRepository.findByDate(date);}


}
