package com.mycompany.g13;

import java.util.ArrayList;


public class SystemClass {
    
    public static ArrayList<Products> givenOrder = new ArrayList<Products>();
   
    
    public static boolean isMatched(String str)
    {
       return (givenOrder.get(givenOrder.size() - 1).getType().equals(str));
    }
    
    public static void add(Products product)
    {
        givenOrder.add(product);
    }
    
    public static String displayOrder()
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
        
        if(givenOrder.isEmpty())
        {
            System.out.println("Empty list");
        }
        else
        {
            Products.setSub_price(Products.getSub_price() - givenOrder.get(givenOrder.size()-1).getProduct_price());
            Products.setTotal_price();
            Products.setTaxed_price();
            givenOrder.remove(givenOrder.size()-1);
            
        }
    }
    
    public static String displayCalculation()
    {
        String result;
        result = Products.getSub_price() + "TL\n\n" + Products.getTaxed_price() + "TL\n\n" +  Products.getTotal_price() + "TL";
        return result;
    }
    
    public static void clear()
    {
        givenOrder.clear();
        Products.setSub_price(0);
        Products.setTotal_price();
        Products.setTaxed_price();
    }
    
    public static int calculateStar(){
        int star =0;
        for(Products a: givenOrder)
            star+= a.getProduct_price();
        return star/10;
    }
    
    
}
