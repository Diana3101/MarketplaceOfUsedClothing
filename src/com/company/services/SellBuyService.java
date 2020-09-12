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
        for (Thing th: customer.getMyBucket()){
            customer.GiveMoney(th.getPrice());
            for (Seller s: sellers){
                if (s.getClothing().contains(th)){
                    s.GetMoney(th.getPrice());
                    s.getClothing().remove(th);
                }
            }
        }
        customer.getMyBucket().clear();
         System.out.println("Customer " + customer.getFirstName() + " " +
                customer.getLastName() + " bought clothes from her bucket.");
    }

    @Override
    public String toString(){
        return "SellBuyService helps sellers and customers doing transactions.";
    }
}
