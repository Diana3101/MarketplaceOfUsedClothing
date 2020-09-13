package com.company.entities;

import java.util.ArrayList;

public final class Seller extends Person {
    private final ArrayList<Thing> clothing;
    private double account;
    private SellerWish wish;

    public Seller(String firstName, String lastName, ArrayList<Thing> clothing, double account, SellerWish wish) {
        super(firstName,lastName);
        this.clothing = clothing;
        this.account = account;
        this.wish = wish;
    }

    public ArrayList<Thing> getClothing(){
        return clothing;
    }

    public void getMoney(double thing_price){
        this.account += thing_price;
    }

    public SellerWish getWish(){
        return wish;
    }

    public void setWish(SellerWish wish){
        this.wish = wish;
    }

    @Override
    public String toString(){
        return super.toString() + "I`m a seller. My account: " + account +  "; my clothing: " + clothing + ".";
    }

}
