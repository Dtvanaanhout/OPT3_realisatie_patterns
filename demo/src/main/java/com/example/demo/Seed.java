package com.example.demo;

import java.util.ArrayList;

public class Seed {
    
    private ArrayList<Product> producten = new ArrayList<Product>();

    public Seed(){
        addProducten();
    }
    public void addProducten(){
        producten.add(new VrachtAuto(3500,  5500));
        producten.add(new VrachtAuto(5500,  6500));
        producten.add(new VrachtAuto(7500,  7500));
        producten.add(new Boormachine("Klopboormachine", "Makita" , 5 , 1.00));
        producten.add(new Boormachine("Fuel", "Milwaukee" , 5 , 1.00));
        producten.add(new Boormachine("schroeftol", "DeWalt", 5 , 1.00));
        producten.add(new PersonenAuto("BMW",  1350));
        producten.add(new PersonenAuto("Nissan",  1450));
        producten.add(new PersonenAuto("Mercedes",  1550));

    }

    public ArrayList<Product> getProducten() {
        return producten;
    }
}
