package com.carshoprepair.carshop.form;

import java.time.LocalDateTime;

public class SearchRepairForm {
    private Long afm;
    private LocalDateTime date;
    private String plate;

    public Long getAfm() {
        return afm;
    }

    public void setAfm(Long afm) {
        this.afm = afm;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
