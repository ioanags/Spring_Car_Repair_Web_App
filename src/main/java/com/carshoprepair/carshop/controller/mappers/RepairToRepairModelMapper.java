package com.carshoprepair.carshop.controller.mappers;

import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.domain.Repair;
import com.carshoprepair.carshop.models.RepairModel;
import com.carshoprepair.carshop.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class RepairToRepairModelMapper {

    @Autowired
    private PersonServiceImpl personService;

    public RepairModel mapToRepairModel(Repair repair){
        RepairModel repairModel = new RepairModel();
        repairModel.setStatus(repair.getStatus());
        repairModel.setKind(repair.getKind());
        repairModel.setDescription(repair.getDescription());
        repairModel.setDate(repair.getDate());
        repairModel.setCost(repair.getCost());
        repairModel.setPerson(repair.getPerson());

        return repairModel;
    }
}
