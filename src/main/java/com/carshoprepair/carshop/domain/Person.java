package com.carshoprepair.carshop.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Person")
public class Person {
    private static final int MAX_NAME_LENGTH  = 60;

    @Id
    @Column(name = "Person_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FirstName", length = MAX_NAME_LENGTH)
    private String firstName;

    @Column(name = "LastName", length = MAX_NAME_LENGTH)
    private String lastName;

    @Column(name = "Address", length = MAX_NAME_LENGTH)
    private String address;

    @Column(name = "Email",unique = true, length = MAX_NAME_LENGTH)
    private String email;

    @Column(name = "Password", length = MAX_NAME_LENGTH)
    private String password;

    @Column(name="Plate")
    private String plate;

    @Column(name="Carmodel")
    private String carModel;

    @Enumerated(EnumType.STRING)
    @Column(name = "Type", length = MAX_NAME_LENGTH)
    private TypeEnum type;

    @Column(name = "Afm",unique = true,length = MAX_NAME_LENGTH)
    private long afm;


    @OneToMany(mappedBy = "person", targetEntity = Repair.class)
    private List<Repair> repairs;
    public Person(){}

    public Person(String firstName, String lastName, String address, String email, String password, String plate, String carModel, TypeEnum type, Long afm) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.password = password;
        this.plate = plate;
        this.carModel = carModel;
        this.type = type;
        this.afm = afm;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public long getAfm() {
        return afm;
    }

    public void setAfm(long afm) {
        this.afm = afm;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", adress='").append(address).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", afm='").append(afm).append('\'');
        sb.append('}');
        return sb.toString();
    }
}