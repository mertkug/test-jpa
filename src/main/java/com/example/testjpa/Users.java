package com.example.testjpa;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Users {
    @Id @GeneratedValue
    private Long id;

    private String name;

    public Users(String name) {
        this.name = name;
    }

    public Users() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
