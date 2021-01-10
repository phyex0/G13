package com.mycompany.g13;

import static com.mycompany.g13.SystemClass.givenOrder;

public class Food extends Products {
    String calorie;
   
    public Food() {}
    
    public Food(String type, double product_price, String product_name, String calorie) {
        super(product_price, product_name);
        super.setType(type);
        this.calorie = calorie;
    }

    public String getCalorie() {
        return calorie;
    }

    public void setCalorie(String calorie) {
        this.calorie = calorie;
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
        return "O=O=O=O=O=O=O=O=O=O=O=O=O=O=O\n" + "(" + super.getType()+ ") " + "(Calorie: " + this.calorie + ") " + super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
