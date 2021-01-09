package com.mycompany.g13;

import static com.mycompany.g13.SystemClass.givenOrder;

public  class Drinks extends Products{
    
    public String type;

    public Drinks() {}
    
    public Drinks(String type, double product_price, String product_name) {
        super(product_price, product_name);
        this.type = type;
       
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String getType() {
        return type;
    }
    
    @Override
    public void calculate_and_add() {
        if(givenOrder.isEmpty() || (!(SystemClass.isMatched("Espresso")) && !(SystemClass.isMatched("Frappucino")) && !(SystemClass.isMatched("Çay"))))
        {
            Products.addSub_price(this.getProduct_price());
            Products.setTotal_price();
            Products.setTaxed_price();
            SystemClass.givenOrder.add(this);
        }
    }
    
    
     @Override
    public String toString() {
        return "=O=O=O=O=O=O=O=O=O=O=O=O=O=O\n" + this.getProduct_name() + "(" + this.getType() + ") => " + this.getProduct_price()+"₺\n";
    }
    

}
