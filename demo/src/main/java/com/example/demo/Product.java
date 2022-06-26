package com.example.demo;

import java.util.ArrayList;
import java.util.Observer;

abstract class Product implements Observable{

    ArrayList<Observer> observers = new ArrayList<Observer>();
    Klant klant;
    
    protected String verzekeringsInformatie;
    protected String naam;
    protected String description;
    protected boolean verhuurStatus = false;
    abstract double getprijs(int aantalDagenHuren , boolean isVerzekerd);
    abstract String getDescription();
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
    
    public void setInformatie() {
        setNaam();
        setVerzekeringInformatie();
        setDiscription();
        }

    public String getVerzekeringsInformatie(){
        return verzekeringsInformatie;
    }

    public String getNaam(){
        return naam;
    }
    public void setVerzekeringInformatie(){
        verzekeringsInformatie = "De verzekering is niet beschikbaar.";
    }

    public void setNaam(){
        naam =  "Onbekend product";
   } 

   public void setDiscription(){
    description = "Onbekend product";
   }
}
   
