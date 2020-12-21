package com.mycompany.g13;

public class PacketedProducts extends Products {
    private String kafein,profile,aroma;

    public PacketedProducts() {}

    public PacketedProducts(String kafein, String profile, String aroma, double product_price, String product_name) {
        super(product_price, product_name);
        this.kafein = kafein;
        this.profile = profile;
        this.aroma = aroma;
    }

    public String getKafein() {
        return kafein;
    }

    public void setKafein(String kafein) {
        this.kafein = kafein;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    @Override
    public void setProduct_name(String product_name) {
        super.setProduct_name(product_name); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getProduct_name() {
        return super.getProduct_name(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setProduct_price(double product_price) {
        super.setProduct_price(product_price); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getProduct_price() {
        return super.getProduct_price(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
