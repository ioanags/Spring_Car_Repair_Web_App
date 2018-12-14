package com.carshoprepair.carshop.controller.mappers;

import com.carshoprepair.carshop.form.DeleteForm;
import com.carshoprepair.carshop.models.PersonModel;
import com.carshoprepair.carshop.models.RepairModel;
import org.springframework.stereotype.Component;

@Component
public class DeleteMapper {
    public PersonModel Person_deleteModel(DeleteForm deleteForm){
        PersonModel personModel = new PersonModel();
        personModel.setId(deleteForm.getId());

        return personModel;
    }

    public RepairModel Repair_deleteModel(DeleteForm deleteForm){
        RepairModel repairModel = new RepairModel();
        repairModel.setId(deleteForm.getId());

        return repairModel;
    }

}
