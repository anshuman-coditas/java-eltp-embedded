package com;

import javax.persistence.*;

@Entity
@Table(name = "stuinfo")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "state",column =@Column(name = "add_1")),
            @AttributeOverride(name = "city",column =@Column(name = "add_2")),
            @AttributeOverride(name = "country",column =@Column(name = "add_3"))
    })
    private Address address;

    public Student( String name, Address address) {

        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
