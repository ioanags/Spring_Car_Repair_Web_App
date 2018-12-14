package com.carshoprepair.carshop.repository;

import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.domain.Repair;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface RepairJPARepository extends JpaRepository<Repair,Long> {
    List<Repair> findRepairByPerson(Person person);
    List<Repair> findTop10ByOrderByDateAsc();
}
