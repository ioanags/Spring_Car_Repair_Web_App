package com.carshoprepair.carshop.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Repairs")
public class Repair {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Repair_id")
    private Long id;

    @Column(name = "Date", nullable = false)
    private Date date;

    @Column(name = "Kind", nullable = false)
    private String kind;

    @Column(name = "Cost", nullable = false)
    private Long cost;

    @Column(name = "Description", nullable = false)
    private String description;

    @ManyToOne(optional = false, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "person_id")
    private Person person;

    public Repair(Date date, String kind, Long cost, String description, Person person) {
        this.date = date;
        this.kind = kind;
        this.cost = cost;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public Person getPerson() {
        return person;
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

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Author{");
        sb.append("id=").append(id);
        sb.append(", date='").append(date).append('\'');
        sb.append(", kind='").append(kind).append('\'');
        sb.append(", cost='").append(cost).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", person='").append(person.getFirstName()+" "+person.getLastName()).append('\'');
        sb.append('}');
        return sb.toString();
    }


}