package com.company;

import com.company.entities.*;
import com.company.services.ItService;
import com.company.services.MarketingService;
import com.company.services.SellBuyService;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Thing thing1 = new Thing(NameofThing.shirt, 30, Size.M, ConditionOfThing.good);
        Thing thing2 = new Thing(NameofThing.skirt, 35, Size.S, ConditionOfThing.veryGood);
        Thing thing3 = new Thing(NameofThing.suit, 100, Size.S, ConditionOfThing.ideal);
        Thing thing4 = new Thing(NameofThing.jeans, 80, Size.M, ConditionOfThing.norm);
        Thing thing5 = new Thing(NameofThing.dress, 57, Size.L, ConditionOfThing.New);

        ArrayList<Thing> seller1Clothing = new ArrayList<>(Arrays.asList(thing1, thing3));
        ArrayList<Thing> seller2Clothing = new ArrayList<>(Arrays.asList(thing2, thing4));
        ArrayList<Thing> seller3Clothing = new ArrayList<>(Arrays.asList(thing5));

        Seller seller1 = new Seller("Anna", "Derek", seller1Clothing, 0, SellerWish.None);
        Seller seller2 = new Seller("Sasha", "Pupkin", seller2Clothing, 0, SellerWish.TargetedAdvertising);
        Seller seller3 = new Seller("Dana", "Kurina", seller3Clothing, 0, SellerWish.GooglePromotion);

        ArrayList<Thing> customer1Bucket = new ArrayList<>(Arrays.asList(thing1, thing4, thing5));
        ArrayList<Thing> customer2Bucket = new ArrayList<>(Arrays.asList(thing2));

        Customer customer1 = new Customer("Masha", "Driha", Size.M, customer1Bucket, 200, Problems.AppSlowsDown);
        Customer customer2 = new Customer("Dasha", "Anohina", Size.S, customer2Bucket, 500, Problems.ButtonIsNotPressed);

        customer1.removeThingFromBucket(thing5);
        customer2.addThingToBucket(thing3);
        customer2.addThingToBucket(thing5);

        Staff webdeveloper = new Staff("Vasya", "Diduh", 700, "Web-developer");
        Staff webdesigner = new Staff("Vitalik", "Zaitsev", 600, "Web-designer");
        Staff appdeveloper = new Staff("Timur", "Gladchuk", 800, "App-developer");
        Staff CAmanager = new Staff("Nadya", "Korobska", 500, "CA Manager");
        Staff SEOspecialist = new Staff("Nikolay", "Sobolev", 650, "SEO-specialist");

        ItService itService = new ItService(webdeveloper, webdesigner, appdeveloper);

        System.out.println(itService.fixApp(customer1));
        System.out.println(itService.fixInterface(customer2));

        customer1.setProblem(Problems.WebsiteSlowsDown);
        System.out.println(itService.fixSite(customer1));

        MarketingService marketingService = new MarketingService(CAmanager, SEOspecialist);

        System.out.println(marketingService.installTargeting(seller2));
        System.out.println(marketingService.promotion(seller3));

        ArrayList<Seller> sellersForTransaction1 = new ArrayList<>(Arrays.asList(seller1, seller2));
        ArrayList<Seller> sellersForTransaction2 = new ArrayList<>(Arrays.asList(seller1, seller2, seller3));

        SellBuyService transaction1 = new SellBuyService(sellersForTransaction1, customer1);
        SellBuyService transaction2 = new SellBuyService(sellersForTransaction2, customer2);

        transaction1.buying();
        transaction2.buying();

        System.out.println(transaction1.toString());
        System.out.println(transaction2.toString());

    }
}

