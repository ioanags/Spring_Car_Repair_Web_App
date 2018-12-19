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
        person.setAfm(0L);
        person.setPlate("");

        repairModel.setDate(repair.getDate());
        repairModel.getPerson().setAfm(repair.getPerson().getAfm());
        repairModel.getPerson().setPlate(repair.getPerson().getPlate());
        return repairModel;
    }
}
