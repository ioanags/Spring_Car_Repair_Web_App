package com.carshoprepair.carshop.service;

import com.carshoprepair.carshop.domain.Owner;

import java.util.List;
import java.util.Optional;

public interface OwnerService  {
    List<Owner> getAllCustomers();

    Optional<Owner> findCustomer(Long id);
}
