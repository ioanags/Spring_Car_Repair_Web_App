package com.carshoprepair.carshop.service;

import com.carshoprepair.carshop.controller.mappers.RepairToRepairModelMapper;
import com.carshoprepair.carshop.controller.mappers.SearchRepairMapper;
import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.domain.Repair;
import com.carshoprepair.carshop.form.EditRepairForm;
import com.carshoprepair.carshop.models.RepairModel;
import com.carshoprepair.carshop.repository.PersonJPARepository;
import com.carshoprepair.carshop.repository.RepairJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RepairServiceImpl implements RepairService {
    @Autowired
    private RepairJPARepository repairJPARepository;

    @Autowired
    private PersonServiceImpl personService;

    @Autowired
    private RepairToRepairModelMapper repairModelMapper;
    @Autowired
    private SearchRepairMapper searchRepairMapper;
    @Autowired
    private PersonJPARepository personJPARepository;

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
    @Override
    public Repair findRepairById(long id){
        return repairJPARepository.findRepairById(id);
    }




    public Repair editRepair(EditRepairForm editRepairForm){
        Repair repair = repairJPARepository.findById(editRepairForm.getId()).get();
        repair.setCost(editRepairForm.getCost());
        repair.setDate(editRepairForm.getDate());
        repair.setDescription(editRepairForm.getDescription());
        repair.setKind(editRepairForm.getKind());
        repair.setStatus(editRepairForm.getStatus());
        repair.setId(editRepairForm.getId());


         return repairJPARepository.save(repair);

    }






    @Override
    public List<RepairModel> searchRepairByAfm(Long afm){
        List<Person> person = personJPARepository.findPersonByAfm(afm);
        return person.get(0).getRepairs()
                .stream()
                .map(repair -> searchRepairMapper.mapToRepairModel(repair))
                .collect(Collectors.toList());


    }

    @Override
    public List<RepairModel> searchRepairByDate(LocalDateTime date) {
        return repairJPARepository
                .findRepairByDate(date)
                .stream()
                .map(repair -> searchRepairMapper.mapToRepairModel(repair))
                .collect(Collectors.toList());
    }
    @Override
    public List<RepairModel> searchRepairByPlate(String plate) {
        Person person = personJPARepository.findPersonByPlate(plate);
        return person.getRepairs()
                .stream()
                .map(repair -> searchRepairMapper.mapToRepairModel(repair))
                .collect(Collectors.toList());
    }




}
