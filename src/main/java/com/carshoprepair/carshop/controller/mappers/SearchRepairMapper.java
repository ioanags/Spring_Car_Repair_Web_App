package com.carshoprepair.carshop.controller.mappers;



import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.domain.Repair;
import com.carshoprepair.carshop.models.RepairModel;

import org.springframework.stereotype.Component;

@Component
public class SearchRepairMapper {
    public RepairModel mapToRepairModel(Repair repair){
        RepairModel repairModel = new RepairModel();
        Person person = new Person();
        repairModel.setPerson(person);
        repairModel.setId(repair.getId());
        repairModel.setCost(repair.getCost());
        repairModel.setDescription(repair.getDescription());
        repairModel.setKind(repair.getKind());
        repairModel.setStatus(repair.getStatus());
        repairModel.setDate(repair.getDate());
        repairModel.getPerson().setAfm(repair.getPerson().getAfm());
        repairModel.getPerson().setPlate(repair.getPerson().getPlate());
        repairModel.getPerson().setFirstName(repair.getPerson().getFirstName());
        repairModel.getPerson().setLastName(repair.getPerson().getLastName());
        return repairModel;
    }
}
