package com.mycompany.g13;

import java.util.ArrayList;


public class Payment {
    
    public static ArrayList<Products> givenOrder = new ArrayList<Products>();
     
    public static String display()
    {
        String result = "";
        for(int i = 0; i < givenOrder.size(); i++)
        {
            Products product = givenOrder.get(i);
            result += product.toString();
        }
        
        return result;
    }
    
    public static void removeLastOrder(){
        
        if(givenOrder.size() == 0)
        {
            System.out.println("Empty list");
        }
        else
        {
            Products.setTotal_price(Products.getTotal_price() - givenOrder.get(givenOrder.size()-1).getProduct_price());
            givenOrder.remove(givenOrder.size()-1);
        }
    }
    
    public static String displayCalculation()
    {
        String result = "";
        result += Products.getTotal_price();
        return result;
    }
    
    public static int calculateStar(){
        int star =0;
        for(Products a: givenOrder)
            star+= a.getProduct_price();
        return star/10;
    }
    
    public static double tax(){
        int tax = 0;
        for(Products p: givenOrder)
            tax += p.getProduct_price();
        return tax*0.18;
    }
    
    
}
