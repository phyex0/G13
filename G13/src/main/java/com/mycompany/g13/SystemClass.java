package com.mycompany.g13;

import static com.mycompany.g13.CafeManagementGUI.jTextArea6;
import static com.mycompany.g13.CafeManagementGUI.loginClient;
import static com.mycompany.g13.CafeManagementGUI.order;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class SystemClass implements TimeInterface {
    
    public static ArrayList<Products> givenOrder = new ArrayList<Products>();
    public static ArrayList<Products> allOrders = new ArrayList<Products>();
    public static ArrayList<Integer> conditionStar =new ArrayList<Integer>();
    
   public FileIO fileIssue = new FileIO();
    
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
            order.setText(SystemClass.displayOrder(givenOrder));
            
            
        }
        else
        {
            Products.setSub_price(Products.getSub_price() - givenOrder.get(givenOrder.size()-1).getProduct_price());
            Products.update_prices();
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
        Products.update_prices();
    }
    
    
    //10% of total cost gives you star
    public static int calculateStar(){
        int star =0;
        for(Products a: givenOrder)
            star+= a.getProduct_price();
        return star/10;
    }
    
    //if you're buy some of those products you're going to earn extra star.
    public static void addConditionStar(){
        if(loginClient!=null){
            Products p = givenOrder.get(givenOrder.size()-1);

            if(p instanceof Gifts)
                conditionStar.add(100);
            if(p instanceof PacketedProducts)
                conditionStar.add(50);
            if(p instanceof Food)
                conditionStar.add(20);  
        }
    }
    
    public static int calculateConditionStar(){
        
        int sum=0;
        for(Integer i: conditionStar)
            sum+=i;
        
        return sum;
        
    }
    
    public static void removeLastConditionStar(){
        if(loginClient!=null){
            Products p = givenOrder.get(givenOrder.size()-1);

            if(p.getProduct_price()!=0 &&(p instanceof Gifts || p instanceof PacketedProducts || p instanceof Food))
                conditionStar.remove(conditionStar.size()-1);

        }
        
    }

    @Override
    public void setTime() {
           //Update Time. Do not modify - Burak;
   
        Thread Clock = new Thread(){
            @Override
            public void run(){
                for(;;){
                    try {
                        sleep(1000);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss MM/dd/yyyy "); 
                        LocalDateTime now = LocalDateTime.now();  
                        jTextArea6.setText("   "+dtf.format(now));
                    
                    }catch (Exception e){
                        System.out.println("Error");
                    }
                }
           }
        };
        Clock.start();
    
   
    }
    
    
}
