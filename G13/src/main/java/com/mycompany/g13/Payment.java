package com.mycompany.g13;

import java.util.ArrayList;


public class Payment {
    
    public ArrayList<Products> givenOrder = new ArrayList<Products>();
    
    public void removeLastOrder(ArrayList ar){
        
        if(ar.size()>=1)
            ar.remove(ar.size()-1);
        else
            System.out.println("Empty list");
    }
    
    public void clearAllOrders(ArrayList ar){      
        ar.clear();
    }
    
    public int calculateStar(ArrayList<Products> ar){
        int star =0;
        for(Products a: ar)
            star+= a.getProduct_price();
        return star/10;
    }
    
    public double tax(ArrayList<Products> ar){
        int tax = 0;
        for(Products p: ar)
            tax += p.getProduct_price();
        return tax*0.18;
    }
    
  
    public String toString(ArrayList ar){
        String result = "";
        for(int i=0; i< ar.size();i++){
            result+=ar.get(i)+"\n";
        }
        return result;
    }
    
}
