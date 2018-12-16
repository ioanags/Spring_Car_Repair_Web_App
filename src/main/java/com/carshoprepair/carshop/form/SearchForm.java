package com.carshoprepair.carshop.form;

public class SearchForm {
    private Long afm;
    private String email;

    public String getEmail() {
        return email;
    }

    public Long getAfm() {
        return afm;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAfm(Long afm) {
        this.afm = afm;
    }
}
