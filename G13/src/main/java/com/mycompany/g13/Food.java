package com.mycompany.g13;

import static com.mycompany.g13.SystemClass.givenOrder;

public class Food extends Products {
   
    public Food() {}
    
    public Food(String type, double product_price, String product_name) {
        super(product_price, product_name);
        this.type = type;
    }

    @Override
    public void calculate_and_add() {
        if(givenOrder.isEmpty() || (!(SystemClass.isMatched("Espresso")) && !(SystemClass.isMatched("Frappucino")) && !(SystemClass.isMatched("Çay"))))
        {
            Products.addSub_price(this.getProduct_price());
            Products.update_prices();
            SystemClass.add(this);
        }
    }
    
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
