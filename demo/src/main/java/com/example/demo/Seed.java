package com.example.demo;


import java.util.ArrayList;



public class Seed {
    
    private ArrayList<Product> producten = new ArrayList<Product>();
    private ArrayList<ProductFactory> soortenProducten= new ArrayList<ProductFactory>();
   
   public Seed(){
        addProducten();
        addSoortenProducten();
    }
    public void addProducten(){
    
        producten.add(ProductFactory.PERSONENAUTO_FACTORY.createProduct("BMW",  "1350",  50,  0.01));
        producten.add(ProductFactory.PERSONENAUTO_FACTORY.createProduct("Audi",  "1450",  50,  0.01));
        producten.add(ProductFactory.PERSONENAUTO_FACTORY.createProduct("VW",  "1550",  50,  0.01));
        
        producten.add(ProductFactory.VRACHTAUTO_FACTORY.createProduct("3500",  "5500",  0.10,  0.01));
        producten.add(ProductFactory.VRACHTAUTO_FACTORY.createProduct("5500",  "6500",  0.10,  0.01));
        producten.add(ProductFactory.VRACHTAUTO_FACTORY.createProduct("7500",  "7500",  0.10,  0.01));

        producten.add(ProductFactory.BOORMACHINE_FACTORY.createProduct("Klopboormachine", "Makita", 5,  1.00));
        producten.add(ProductFactory.BOORMACHINE_FACTORY.createProduct("Accuboormachine", "DeWalt", 5,  1.00));
        producten.add(ProductFactory.BOORMACHINE_FACTORY.createProduct("Boorhamer", "Makita", 5,  1.00));

      
    }
    public void addSoortenProducten(){
        soortenProducten.add(new PersonenAutoFactory());
        soortenProducten.add(new VrachtAutoFactory());
        soortenProducten.add(new BoormachineFactory());
    }
    public ArrayList<ProductFactory> getsoortenProducten(){
        return soortenProducten;
    }
    public ArrayList<Product> getProducten() {
       return producten;
    }

    
   
}
