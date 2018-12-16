package com.carshoprepair.carshop.controller.mappers;

import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.form.RepairForm;
import com.carshoprepair.carshop.models.RepairModel;
import com.carshoprepair.carshop.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class RepairFormToModelMapper {

    @Autowired
    private PersonServiceImpl personService;

    public RepairModel mapToRepairModel(RepairForm repairForm){
        Person person = personService.findPersonById(repairForm.getPerson_id());
        RepairModel repairModel = new RepairModel();
        repairModel.setCost(repairForm.getCost());
        repairModel.setDate(repairForm.getDate());
        repairModel.setDescription(repairForm.getDescription());
        repairModel.setKind(repairForm.getKind());
        repairModel.setPerson(person);
        repairModel.setStatus(repairForm.getStatus());

        return repairModel;
    }
}
