package com.mycompany.g13;

public class Syrup extends Products
{
    
    public Syrup(String product_name, double product_price) 
    {
        super(product_price, product_name);
    }
    
    
    @Override
    public String toString() {
        return super.getProduct_name() + " => " + super.getProduct_price()+"$\n"; 
    }
    
}
