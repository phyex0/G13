package com.mycompany.g13;

import static com.mycompany.g13.SystemClass.givenOrder;

public class Food extends Products {
    
    private String type;

    public Food() {}
    
    public Food(String type, double product_price, String product_name) {
        super(product_price, product_name);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
