package com.mycompany.g13;

public class PacketedProducts extends Products {
    
    private String profile;

    public PacketedProducts() {}

    public PacketedProducts(String kafein, String profile, String aroma, double product_price, String product_name) {
        super(product_price, product_name);
        this.profile = profile; 
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
