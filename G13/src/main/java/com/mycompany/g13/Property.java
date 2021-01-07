package com.mycompany.g13;

public class Property extends Drinks
{

    public Property(String type, String product_name, double product_price) 
    {
        super(type, product_price, product_name);

    }
    
    @Override
    public void calculate_and_add() {

         Products.addSub_price(this.getProduct_price());
         Products.setTotal_price();
         Products.setTaxed_price();
         SystemClass.givenOrder.add(this);
    }
    
    
    @Override
    public String toString() {
        return super.getProduct_name() + " => " + super.getProduct_price()+"₺\n"; 
    }
 
    
}