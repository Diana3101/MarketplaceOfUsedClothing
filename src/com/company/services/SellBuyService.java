package com.company.services;
import com.company.entities.Seller;
import com.company.entities.Customer;
import com.company.entities.Thing;

import java.util.ArrayList;


public final class SellBuyService {
    private final ArrayList<Seller> sellers;
    private final Customer customer;

    public SellBuyService(ArrayList<Seller> sellers, Customer customer) {
        this.sellers = sellers;
        this.customer = customer;
    }

    public void buying(){
        ArrayList<Thing> bucket = customer.getBucket();

        for (Thing th: bucket){
            double price = th.getPrice();
            customer.giveMoney(price);
            for (Seller s: sellers){
                ArrayList<Thing> clothing = s.getClothing();
                if (!clothing.contains(th)) {
                    continue;
                }
                s.getMoney(price);
                clothing.remove(th);
            }
        }
        bucket.clear();
    }

    @Override
    public String toString(){
        return customer.getFirstName() + " " + customer.getLastName() + " bought clothes from her bucket.";
    }
}
