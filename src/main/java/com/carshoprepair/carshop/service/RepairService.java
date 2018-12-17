package com.carshoprepair.carshop.service;

import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.domain.Repair;
import com.carshoprepair.carshop.models.RepairModel;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface RepairService  {
    List<Repair> findRepairByPerson(Person person);
    List<Repair> recentRepairs();
    List<Repair> findAll();
    void delete(Long id);
    RepairModel create(RepairModel repairModel);
    Repair findRepairById(long id);
    List<RepairModel> searchRepairByPlate(String plate);
    List<RepairModel> searchRepairByAfm(Long afm);
    List<RepairModel> searchRepairByDate(LocalDateTime date);

}
