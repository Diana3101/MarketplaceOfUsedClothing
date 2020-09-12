package com.company.entities;

import java.util.ArrayList;

public final class Customer extends Person {
    private final Size size;
    private final ArrayList<Thing> bucket;
    private double account;
    private Problems problem;

    public Customer(String firstName, String lastName, Size size, ArrayList<Thing> bucket, double account, Problems problem) {
        super(firstName,lastName);
        this.size = size;
        this.bucket = bucket;
        this.account = account;
        this.problem = problem;
    }

    public ArrayList<Thing> getMyBucket(){
        return bucket;
    }

    public void addThingToBucket(Thing thing){
        bucket.add(thing);
    }

    public void removeThingFromBucket(Thing thing){
        bucket.remove(thing);
    }

    public void GiveMoney(double thing_price){
        this.account -= thing_price;
    }

    public Problems getProblem(){
        return problem;
    }

    public void setProblem(Problems problem){
        this.problem = problem;
    }



    @Override
    public String toString(){
        return super.toString() + "I`m a customer. My account: " + account + "my size: " + size + "; my bucket: " + bucket + ".";
    }
}
