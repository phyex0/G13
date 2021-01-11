package com.mycompany.g13;

import static com.mycompany.g13.SystemClass.givenOrder;

public class Gifts extends Products {
    private String brand;
 
    public Gifts() {}
   
    public Gifts(double product_price, String product_name, String brand) {
        super(product_price, product_name);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    
    @Override
    public void calculate_and_add() {
        if(givenOrder.isEmpty() || !(SystemClass.isMatched("Espresso")) && !(SystemClass.isMatched("Frappucino")) && !(SystemClass.isMatched("Çay")))
        {
            Products.addSub_price(this.getProduct_price());
            Products.update_prices();
            SystemClass.add(this);
        }
    }
    
    @Override
    public String toString() {
        return "O=O=O=O=O=O=O=O=O=O=O=O=O=O=O\n" + "(" + this.brand + ") "+ super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
