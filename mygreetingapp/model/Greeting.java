package com.bridgelabz.mygreetingapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Greeting {

    private  String lastName;
    private  String firstName;
    @Id
    private long id;
    public Greeting(Greeting greet) {
        this.id = id;
        this.firstName = getFirstName();
        this.lastName = getLastName();
    }

    public Greeting() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Greeting(String lastName, String firstName, long id) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
