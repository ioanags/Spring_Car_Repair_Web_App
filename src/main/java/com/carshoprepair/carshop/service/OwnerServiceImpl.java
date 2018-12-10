package com.carshoprepair.carshop.service;

import com.carshoprepair.carshop.domain.Owner;
import com.carshoprepair.carshop.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class OwnerServiceImpl implements OwnerService{
    @Autowired
    private OwnerRepository ownerRepository;
    @Override
    public List<Owner> getAllCustomers(){
        return ownerRepository.findAll();}

    @Override
    public Optional<Owner> findCustomer(Long id){
        return ownerRepository.findById(id);}
}
