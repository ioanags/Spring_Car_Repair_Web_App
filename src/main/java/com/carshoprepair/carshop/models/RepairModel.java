package com.carshoprepair.carshop.models;

import java.util.Date;

public class RepairModel {
    private Long id;
    private Date date;
    private String kind;
    private Long cost;
    private String status;
    private String description;
    private Long person_id;

    public Long getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Long person_id) {
        this.person_id = person_id;
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
