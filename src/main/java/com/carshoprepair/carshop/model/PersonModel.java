package com.carshoprepair.carshop.model;

import com.carshoprepair.carshop.domain.TypeEnum;

public class PersonModel {

    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String Afm;
    private String password;
    private TypeEnum type;


    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAfm(String afm) {
        Afm = afm;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getAfm() {
        return Afm;
    }

    public String getPassword() {
        return password;
    }

    public TypeEnum getType() {
        return type;
    }
}
