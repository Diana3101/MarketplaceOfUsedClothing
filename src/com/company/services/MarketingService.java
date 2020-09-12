package com.company.services;


import com.company.entities.Seller;
import com.company.entities.SellerWish;
import com.company.entities.Staff;

public final class MarketingService {
    private final Staff CAManager;
    private final Staff SEOSpecialist;

    public MarketingService(Staff CAManager, Staff SEOSpecialist) {
        this.CAManager = CAManager;
        this.SEOSpecialist = SEOSpecialist;
    }

    public void installTargeting(Seller seller){
        System.out.println(this.CAManager.getPosition() + " " + this.CAManager.getFirstName() + " helped seller with " + seller.getWish() + ".");
        seller.setWish(SellerWish.None);
    }

    public void Promotion(Seller seller){
        System.out.println(this.SEOSpecialist.getPosition() + " " + this.SEOSpecialist.getFirstName() + " helped seller with " + seller.getWish() + ".");
        seller.setWish(SellerWish.None);
    }

    @Override
    public String toString(){
        return "There are CA Manager and SEO-specialist in our Marketing service";
    }

}
