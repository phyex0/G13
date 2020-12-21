package com.mycompany.g13;

public  class Drinks extends Products implements Sizeable {
    
    private String type,size;

    public Drinks() {}
    
    public Drinks(String type, double product_price, String product_name,String size) {
        super(product_price, product_name);
        this.type = type;
        this.size=size;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getType() {
        return type;
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
    public void setSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
