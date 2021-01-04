package com.mycompany.g13;

public  class Drinks extends Products implements Sizeable {
    
    private String type,size="Küçük",milk="Yağsız",syrup="";

    public Drinks() {}
    
    public Drinks(String type, double product_price, String product_name) {
        super(product_price, product_name);
        this.type = type;
       
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }

    public String getSyrup() {
        return syrup;
    }

    public void setSyrup(String syrup) {
        this.syrup = syrup;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getType() {
        return type;
    }

    
     @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public void setDrinkFeatures(String size, String milk, String extras) {
   
            this.setSize(size);
            this.setMilk(milk);
            this.setSyrup(extras);
        
        
    }
}
