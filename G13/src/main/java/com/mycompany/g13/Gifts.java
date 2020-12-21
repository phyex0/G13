package com.mycompany.g13;

public class Gifts extends Products {

    public Gifts() {}

    public Gifts(double product_price, String product_name) {
        super(product_price, product_name);
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
