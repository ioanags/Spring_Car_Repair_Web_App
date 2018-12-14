package com.carshoprepair.carshop.service;

import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.domain.Repair;
import com.carshoprepair.carshop.repository.RepairJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class RepairServiceImpl implements RepairService {
    @Autowired
    private RepairJPARepository repairJPARepository;

    @Override
    public List<Repair> findRepairByPerson(Person person) {

        return repairJPARepository.findRepairByPerson(person);
    }

    @Override
    public List<Repair> findAll(){return repairJPARepository.findAll();}

    @Override
    public List<Repair> recentRepairs() {return repairJPARepository.findTop10ByOrderByDateAsc();}


    public void delete(Long id){
        repairJPARepository.deleteById(id);
    }




}
