package com.mycompany.g13;

public class Food extends Products {
    
    private String type;

    public Food() {}
    
    public Food(String type, double product_price, String product_name) {
        super(product_price, product_name);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
