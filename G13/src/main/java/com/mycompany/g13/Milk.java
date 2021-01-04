package com.mycompany.g13;

public class Milk extends Products{
    public Milk(String product_name, double product_price) 
    {
        super(product_price, product_name);
    }
    
    
    @Override
    public String toString() {
        return super.getProduct_name() + " => " + super.getProduct_price()+"$\n";
    }
}

