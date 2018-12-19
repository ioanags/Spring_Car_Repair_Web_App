package com.carshoprepair.carshop.service;

import com.carshoprepair.carshop.controller.mappers.PersonToPersonModelMapper;
import com.carshoprepair.carshop.controller.mappers.SearchMapper;
import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.form.EditForm;
import com.carshoprepair.carshop.models.PersonModel;
import com.carshoprepair.carshop.repository.PersonJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonJPARepository personJPARepository;
    @Autowired
    private PersonToPersonModelMapper personModelMapper;
    @Autowired
    private SearchMapper searchMapper;
    @Autowired
    private PasswordEncoder passwordEncoder;




    @Override
    public List<Person> findAll(){
        return personJPARepository.findAll();
    }




    @Override
    public PersonModel create(PersonModel personModel) {
        Person person = new Person(
                personModel.getFirstName(),
                personModel.getLastName(),
                personModel.getAddress(),
                personModel.getEmail(),
                passwordEncoder.encode(personModel.getPassword()),
                personModel.getPlate(),
                personModel.getCarModel(),
                personModel.getType(),
                personModel.getAfm());
        Person savedPerson= personJPARepository.save(person);
        return personModelMapper.mapToPersonModel(savedPerson);
    }

    @Override
    public Person findPersonById(long id){
        return personJPARepository.findPersonById(id);
    }

    public void delete(Long id){
        personJPARepository.deleteById(id);
    }

    public Person edit(EditForm editForm){
        Person person = personJPARepository.findById(Long.parseLong(editForm.getId())).get();
                person.setFirstName(editForm.getFirstName());
                person.setLastName(editForm.getLastName());
                person.setAddress(editForm.getAddress());
                person.setEmail(editForm.getEmail());
                person.setPassword(editForm.getPassword());
                person.setPlate(editForm.getPlate());
                person.setCarModel(editForm.getCarModel());
                person.setType(editForm.getType());
                person.setAfm(editForm.getAfm());

       return personJPARepository.save(person);

    }
    @Override
    public List<PersonModel> searchByAfmAndEmail(Long afm, String email){
        return personJPARepository
                .findPersonByAfmAndEmail(afm,email)
                .stream()
                .map(person -> searchMapper.mapToPersonModel(person))
                .collect(Collectors.toList());
    }

    @Override
    public List<PersonModel> searchByAfm(Long afm) {
        return personJPARepository
                .findPersonByAfm(afm)
                .stream()
                .map(person -> searchMapper.mapToPersonModel(person))
                .collect(Collectors.toList());
    }

    @Override
    public List<PersonModel> searchByEmail(String email){
        return personJPARepository
                .findPersonByEmail(email)
                .stream()
                .map(person -> searchMapper.mapToPersonModel(person))
                .collect(Collectors.toList());
    }

    @Override
    public Person findPersonByLastname(String lastname) {
        return personJPARepository.findPersonByLastName(lastname);
    }


}
