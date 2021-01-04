package com.mycompany.g13;

public abstract class Products {
    
    private double product_price;
    private String product_name;
    private static double sub_price;
    private static double taxed_price;
    private static double tax = 18;
    private static double total_price;

    public Products()
    {
    }
    

    public Products(double product_price, String product_name) {
        this.product_price = product_price;
        this.product_name = product_name;
    }

    public String getProduct_name() {
        return product_name;
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
    
    public static double getTax() {
        return tax;
    }

    public static void setTax(double tax) {
        Products.tax = tax;
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
    
    @Override
    public String toString(){
        return "=O=O=O=O=O=O=O=O=O=O=O=O=O=O\n" + this.product_name + " => " + this.product_price+"$\n";
    }
}