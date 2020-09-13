package com.company.entities;


import java.util.UUID;

public final class Thing {
    private final UUID id;
    private final NameofThing name;
    private final Size size;
    private final ConditionOfThing condition;
    private final double price;

    public Thing(NameofThing name, double price, Size size, ConditionOfThing condition) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.price = price;
        this.size = size;
        this.condition = condition;
    }

    public double getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return "ID: " + id + "; thing name: " + name + "; condition: "+ condition + "; size: "
                + size + "; price: " + price + ".";
    }
}
