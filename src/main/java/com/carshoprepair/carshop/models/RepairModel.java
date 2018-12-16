package com.carshoprepair.carshop.models;

import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.service.PersonServiceImpl;
import com.fasterxml.jackson.annotation.OptBoolean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.Optional;


public class RepairModel {
    private Long id;
    private Date date;
    private String kind;
    private Long cost;
    private String status;
    private String description;
    private Person person;



    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getKind() {
        return kind;
    }

    public Long getCost() {
        return cost;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
