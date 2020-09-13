package com.company.services;


import com.company.entities.Seller;
import com.company.entities.SellerWish;
import com.company.entities.Staff;

public final class MarketingService {
    private final Staff CaManager;
    private final Staff SeoSpecialist;

    public MarketingService(Staff CaManager, Staff SeoSpecialist) {
        this.CaManager = CaManager;
        this.SeoSpecialist = SeoSpecialist;
    }

    public String installTargeting(Seller seller){
        SellerWish wish = seller.getWish();
        seller.setWish(SellerWish.None);
        return this.CaManager.getPosition() + " " + this.CaManager.getFirstName() + " helped seller with " + wish + ".";
    }

    public String promotion(Seller seller){
        SellerWish wish = seller.getWish();
        seller.setWish(SellerWish.None);
        return this.SeoSpecialist.getPosition() + " " + this.SeoSpecialist.getFirstName() + " helped seller with " + wish + ".";

    }

    @Override
    public String toString(){
        return "There are CA Manager and SEO-specialist in our Marketing service";
    }

}
