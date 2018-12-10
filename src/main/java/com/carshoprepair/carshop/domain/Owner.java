package com.carshoprepair.carshop.domain;

import javax.persistence.*;

@Entity

public class Owner {
    private static final int MAX_NAME_LENGTH  = 60;

    @Column(name="firstname",length= MAX_NAME_LENGTH)
    private String firstName;

    @Column(name="lastname",length= MAX_NAME_LENGTH)
    private String lastName;

    @Id
    @Column(name = "person_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="afm",nullable = false,unique = true)
    private long afm;

    @Column(name="address",nullable = false)
    private String address;

    @Column(name="email",nullable = false)
    private String email;

    @Column(name="password",nullable = false)
    private String password;

    @Column(name="plate",nullable = false)
    private String plate;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_type")
    private Type type;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }



     public Owner (){}

    public Owner(String firstName, String lastName, long afm, String address, String email, String password, String plate, Type type) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.afm = afm;
        this.address = address;
        this.email = email;
        this.password = password;
        this.plate = plate;
        this.type = type;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getAfm() {
        return afm;
    }

    public void setAfm(long afm) {
        afm = afm;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
