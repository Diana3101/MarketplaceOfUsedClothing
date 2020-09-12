package com.company.entities;

public final class Staff extends Person{
    private final double salary;
    private final String position;

    public Staff(String firstName, String lastName, double salary, String position) {
        super(firstName, lastName);
        this.salary = salary;
        this.position = position;
    }

    public String getPosition(){
        return position;
    }

    @Override
    public String toString() {
        return super.toString() + "I`m a " + position + "; my salary: " + salary + ".";
    }
}

