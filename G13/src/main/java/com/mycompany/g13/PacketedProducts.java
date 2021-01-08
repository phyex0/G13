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
    
    @Override
    public void calculate_and_add() {
        if(givenOrder.isEmpty() || (!(SystemClass.isMatched("Espresso")) && !(SystemClass.isMatched("Frappucino")) && !(SystemClass.isMatched("Çay"))))
        {
            Products.addSub_price(this.getProduct_price());
            Products.setTotal_price();
            Products.setTaxed_price();
            SystemClass.add(this);
        }
    }

    
    @Override
    public String toString() {
        return "=O=O=O=O=O=O=O=O=O=O=O=O=O=O\n" + this.profile + "-" + this.product_name + " => " + this.product_price+"TL\n";
    }
    
}
