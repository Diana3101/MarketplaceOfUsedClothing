package com.company.entities;

import java.util.UUID;

public class Person {
    private final UUID id;
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    @Override
    public String toString(){
        return "ID: " + id + "; First Name: " + firstName + "; Last Name: " + lastName + "; ";
    }
}
