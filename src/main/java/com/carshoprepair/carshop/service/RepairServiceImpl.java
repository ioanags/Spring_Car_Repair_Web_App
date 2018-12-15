package com.carshoprepair.carshop.service;

import com.carshoprepair.carshop.controller.mappers.RepairToRepairModelMapper;
import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.domain.Repair;
import com.carshoprepair.carshop.models.RepairModel;
import com.carshoprepair.carshop.repository.RepairJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class RepairServiceImpl implements RepairService {
    @Autowired
    private RepairJPARepository repairJPARepository;

    @Autowired
    private PersonServiceImpl personService;

    @Autowired
    private RepairToRepairModelMapper repairModelMapper;

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

    @Override
    public RepairModel create(RepairModel repairModel) {
        Repair repair = new Repair(
                repairModel.getDate(),
                repairModel.getKind(),
                repairModel.getCost(),
                repairModel.getDescription(),
                repairModel.getPerson(),
                repairModel.getStatus());

        Repair savedRepair = repairJPARepository.save(repair);
        return  repairModelMapper.mapToRepairModel(savedRepair);

    }


}
