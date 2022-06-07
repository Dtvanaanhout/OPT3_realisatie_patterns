package com.example.demo;


import java.util.ArrayList;
import java.util.Observer;





public class Seed implements Observable{

    private ArrayList<Product> producten = new ArrayList<>();
    private ArrayList<ProductFactory> soortenProducten= new ArrayList<ProductFactory>();
    private final ArrayList<Observer> observers = new ArrayList<>();
    
   public Seed(){
        
        addProducten();
        addSoortenProducten();
    }
    public void addProducten(){
    
        producten.add(ProductFactory.PERSONENAUTO_FACTORY.createProduct("BMW",  "1350"));
        producten.add(ProductFactory.PERSONENAUTO_FACTORY.createProduct("Audi",  "1450"));
        producten.add(ProductFactory.PERSONENAUTO_FACTORY.createProduct("VW",  "1550"));
        
        producten.add(ProductFactory.VRACHTAUTO_FACTORY.createProduct("3500",  "5500"));
        producten.add(ProductFactory.VRACHTAUTO_FACTORY.createProduct("5500",  "6500"));
        producten.add(ProductFactory.VRACHTAUTO_FACTORY.createProduct("7500",  "7500"));

        producten.add(ProductFactory.BOORMACHINE_FACTORY.createProduct("Klopboormachine", "Makita" ));
        producten.add(ProductFactory.BOORMACHINE_FACTORY.createProduct("Accuboormachine", "DeWalt"));
        producten.add(ProductFactory.BOORMACHINE_FACTORY.createProduct("Boorhamer", "Makita"));

      
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

    public void addProductenToArray(Product product){
            producten.add(product);
            notifyObservers();
        }
    @Override
    public void addObserver(Observer o) {
        observers.add(o); 
    }
    @Override
    public void notifyObservers() {
        for(Observer o : observers) {
            o.update(null, null);
        }  
    }
}

