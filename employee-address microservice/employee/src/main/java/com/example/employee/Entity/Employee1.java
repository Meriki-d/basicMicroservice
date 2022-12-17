package com.example.employee.Entity;

import jakarta.annotation.Generated;
import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class Employee1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String name;
    private String bloodGroup;
    private String email;

    public Employee1() {
    }

    public Employee1(int id, String name, String bloodGroup, String email) {
        this.id = id;
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.email = email;
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

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
