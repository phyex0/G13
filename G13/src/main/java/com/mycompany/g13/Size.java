package com.mycompany.g13;

public class Size extends Products
{

    public Size(String product_name, double product_price) 
    {
        super(product_price, product_name);
    }
    
    
    @Override
    public String toString() {
        return super.getProduct_name() + " => " + super.getProduct_price()+"$\n"; 
    }
 
    
}