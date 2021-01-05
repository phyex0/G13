package com.mycompany.g13;

public class Property extends Products
{

    public Property(String type, String product_name, double product_price) 
    {
        super(product_price, product_name);
        this.type = type;
    }
    
    
    @Override
    public String toString() {
        return super.getProduct_name() + " => " + super.getProduct_price()+"$\n"; 
    }
 
    
}