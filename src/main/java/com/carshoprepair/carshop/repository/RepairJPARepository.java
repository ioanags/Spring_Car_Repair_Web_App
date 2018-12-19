package com.carshoprepair.carshop.repository;

import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.domain.Repair;
import com.carshoprepair.carshop.models.RepairModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface RepairJPARepository extends JpaRepository<Repair,Long> {
    List<Repair> findRepairByPerson(Person person);
    List<Repair> findTop10ByOrderByDateAsc();

    Repair findRepairById(long id);

   List<Repair> findRepairByDate(LocalDateTime date);




}
