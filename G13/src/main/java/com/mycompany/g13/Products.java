package com.mycompany.g13;

public abstract class Products implements P_Interface{
    
    public double product_price;
    public String product_name;
    public String type = "";
    private static double sub_price;
    private static double taxed_price;
    private static double total_price;
    final static double tax = 18;
    private int star = 0;

    public Products(){
    }
    
    public Products(double product_price, String product_name) {
        this.product_price = product_price;
        this.product_name = product_name;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }
    

    public String getProduct_name() {
        return product_name;
    }

    public String getType() {
        return type;
    }
    

    public static double getSub_price() {
        return sub_price;
    }

    public static void setSub_price(double sub_price) {
        Products.sub_price = sub_price;
    }
    
    public static void addSub_price(double product_price)
    {
        Products.sub_price += product_price;
    }

    public static double getTotal_price() {
        return total_price;
    }

    public static void setTotal_price() {
        total_price = sub_price + sub_price * tax / 100;
        Products.total_price = total_price;
    }

    public static double getTaxed_price() {
        return taxed_price;
    }
    
    
    public static void setTaxed_price() {
        Products.taxed_price = (sub_price * 18) / 100;
    }

    public double getProduct_price() {
        return product_price;
    }
    
    public String toString(){
        return "=O=O=O=O=O=O=O=O=O=O=O=O=O=O\n" + this.product_name + " => " + this.product_price+"₺\n";
    }
}