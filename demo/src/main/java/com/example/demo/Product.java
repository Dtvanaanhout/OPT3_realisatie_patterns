package com.example.demo;

import java.util.ArrayList;
import java.util.Observer;

abstract class Product implements Observable{
    ArrayList<Observer> observers = new ArrayList<Observer>();
    
    abstract double getprijs(int aantalDagenHuren , boolean isVerzekerd);
    abstract String getDiscription();
    abstract String getNaam();
    abstract boolean getVerhuurStatus();
    abstract String getVerzekeringsInformatie();
    abstract void setVerhuurStatus(boolean status , Klant klant);
    abstract Klant getKlant();

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(null, this);
        }
    }


    @Override
    public void addObserver(Observer o) {
        observers.add(o);  
    }

}
   
