package com.carshoprepair.carshop.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Person")
public class Person {
    private static final int MAX_NAME_LENGTH  = 60;

    @Id
    @Column(name = "person_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstname", length = MAX_NAME_LENGTH)
    private String firstName;

    @Column(name = "lastname", length = MAX_NAME_LENGTH)
    private String lastName;

    @Column(name = "Adress", length = MAX_NAME_LENGTH)
    private String adress;

    @Column(name = "Email", length = MAX_NAME_LENGTH)
    private String email;

    @Column(name = "Password", length = MAX_NAME_LENGTH)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "Type", length = MAX_NAME_LENGTH)
    private TypeEnum Type;

    @Column(name = "Afm", length = MAX_NAME_LENGTH)
    private String afm;


    @OneToMany(mappedBy = "person", targetEntity = Repair.class)
    private List<Repair> repairs;

    public Person(String firstName, String lastName, String adress, String email, String password, TypeEnum type, String afm, List<Repair> repairs) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.email = email;
        this.password = password;
        this.Type = type;
        this.afm = afm;
        this.repairs = repairs;
    }

    public Person() {
    }

    public static int getMaxNameLength() {
        return MAX_NAME_LENGTH;
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

    public String getAdress() {
        return adress;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public TypeEnum getType() {
        return Type;
    }

    public String getAfm() {
        return afm;
    }

    public List<Repair> getRepairs() {
        return repairs;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setType(TypeEnum type) {
        this.Type = type;
    }

    public void setAfm(String afm) {
        this.afm = afm;
    }

    public void setRepairs(List<Repair> repairs) {
        this.repairs = repairs;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", adress='").append(adress).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", type='").append(Type).append('\'');
        sb.append(", afm='").append(afm).append('\'');
        sb.append('}');
        return sb.toString();
    }
}