package com.mycompany.g13;

import static com.mycompany.g13.SystemClass.givenOrder;

public class PacketedProducts extends Products {
    
    private String profile;

    public PacketedProducts() {}

    public PacketedProducts(String product_name, String profile, double product_price) {
        super(product_price, product_name);
        this.profile = profile; 
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
    
    public void calculate_and_add() {
        if(givenOrder.size() == 0 || (!(givenOrder.get(givenOrder.size() - 1) instanceof Drinks) && !(givenOrder.get(givenOrder.size() - 1).getType().equals("Size"))))
        {
            Products.addSub_price(this.getProduct_price());
            Products.setTotal_price();
            Products.setTaxed_price();
            SystemClass.givenOrder.add(this);
        }
    }

    
    @Override
    public String toString() {
        return "=O=O=O=O=O=O=O=O=O=O=O=O=O=O\n" + this.profile + "-" + this.product_name + " => " + this.product_price+"$\n";
    }
    
}
