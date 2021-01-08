package com.mycompany.g13;

import java.util.ArrayList;


public class SystemClass {
    
    public static ArrayList<Products> givenOrder = new ArrayList<Products>();
    public static ArrayList<Products> allOrders = new ArrayList<Products>();
    
    //keep all the orders until program shutting down
    public static void collectAllOrders(){
        
        allOrders.addAll(givenOrder);
        givenOrder.clear();
        
    }
    
    //search order by their name
    public static Products searchOrder(ArrayList<Products> ar, String name){
            Products p = null;
        for(int i=0;i<ar.size();i++){
            if(ar.get(i).product_name.equalsIgnoreCase(name))
                p = ar.get(i);
        }
        return p;
    }
   
    
    public static boolean isMatched(String str)
    {
       return (givenOrder.get(givenOrder.size() - 1).getType().equals(str));
    }
    
    public static void add(Products product)
    {
        givenOrder.add(product);
    }
    
    public static String displayOrder(ArrayList<Products> order)
    {
        String result = "";
        for(int i = 0; i < order.size(); i++)
        {
            Products product = order.get(i);
            result += product.toString();
        }
        
        return result;
    }
    
    //if you use star menu then you're gonna pay that by star.
    public static int totalStar(ArrayList<Products> ar ){
        int star = 0;
        for(Products p:ar){
            if(p.getStar()!=0)
                star+= p.getStar();
        }
        return star;
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
    
    
    //10% of total cost gives you star
    public static int calculateStar(){
        int star =0;
        for(Products a: givenOrder)
            star+= a.getProduct_price();
        return star/10;
    }
    
    
}
