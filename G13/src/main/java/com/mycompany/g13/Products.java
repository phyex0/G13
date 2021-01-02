package com.mycompany.g13;

public abstract class Products {
    
    private double product_price;
    private String product_name;
    private static double total_price;

    public Products() {}

    public Products(double product_price, String product_name) {
        this.product_price = product_price;
        this.product_name = product_name;
        this.total_price += product_price;
    }

    public static double getTotal_price() {
        return total_price;
    }

    public static void setTotal_price(double total_price) {
        Products.total_price = total_price;
    }
    
    
    

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    
    
    @Override
    public String toString(){
        return this.product_name + " is " + this.product_price+"$\n";
    }
    
       
}
