package com.mycompany.g13;

import static com.mycompany.g13.SystemClass.givenOrder;

public  class Drinks extends Products{

    public Drinks() {}
    
    public Drinks(String type, double product_price, String product_name) {
        super(product_price, product_name);
        super.setType(type);
       
       
    }
    
    @Override
    public void calculate_and_add() {
        if(givenOrder.isEmpty() || (!(SystemClass.isMatched("Espresso")) && !(SystemClass.isMatched("Frappucino")) && !(SystemClass.isMatched("Çay"))))
        {
            Products.addSub_price(this.getProduct_price());
            Products.update_prices();
            SystemClass.givenOrder.add(this);
        }
    }
    
    
    @Override
    public String toString() {
        return "O=O=O=O=O=O=O=O=O=O=O=O=O=O=O\n"+ "(" + super.getType() + ") " + super.toString();
    }
    

}
