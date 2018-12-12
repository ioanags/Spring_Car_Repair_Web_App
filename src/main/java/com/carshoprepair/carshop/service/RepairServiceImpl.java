package com.carshoprepair.carshop.service;

import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.domain.Repair;
import com.carshoprepair.carshop.repository.RepairJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RepairServiceImpl implements RepairService {
    @Autowired
    private RepairJPARepository repairJPARepository;

    @Override
    public List<Repair> findRepairByPerson(Person person) {

        return repairJPARepository.findRepairByPerson(person);
    }
}
