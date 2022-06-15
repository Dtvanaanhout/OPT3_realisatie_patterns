package com.example.demo;

import java.util.ArrayList;
import java.util.Observer;

abstract class Product implements Observable{
    ArrayList<Observer> observers = new ArrayList<Observer>();
    Klant klant;
    protected boolean verhuurStatus = false;
    abstract double getprijs(int aantalDagenHuren , boolean isVerzekerd);
    abstract String getDiscription();
    abstract String getNaam();
    abstract String getVerzekeringsInformatie();
    abstract void setVerhuurStatus(boolean status , Klant klant);
    

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(null, this);
        }
    }

    public Klant getKlant() {
        return klant;
    }
    
    public boolean getVerhuurStatus() {
        
        return verhuurStatus;
    }
    
    @Override
    public void addObserver(Observer o) {
        observers.add(o);  
    }



}
   
