package com.mycompany.g13;

public  class Drinks extends Products{
    
    private String type;

    public Drinks() {}
    
    public Drinks(String type, double product_price, String product_name) {
        super(product_price, product_name);
        this.type = type;
       
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getType() {
        return type;
    }

    
     @Override
    public String toString() {
        return "=O=O=O=O=O=O=O=O=O=O=O=O=O=O\n" + this.getProduct_name() + "(" + this.getType() + ") => " + this.getProduct_price()+"$\n";
    }
    

}
