package com.example.demo;

import java.util.ArrayList;
import java.util.Observer;

abstract class Product implements Observable{

    ArrayList<Observer> observers = new ArrayList<Observer>();
    Klant klant;
    
    protected String verzekeringsInformatie;
    protected String naam;
    protected boolean verhuurStatus = false;
    abstract double getprijs(int aantalDagenHuren , boolean isVerzekerd);
    abstract String getDiscription();
    abstract String getNaam();
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
       
        setVerzekeringInformatieOnbekendProduct();
        if(this instanceof VrachtAuto) {
            verzekeringsInformatie = setVerzekeringInformatieVrachtAuto();
        }
        else if(this instanceof PersonenAuto) {
            verzekeringsInformatie = setVerzekeringInformatiePersononAuto();
        }
        else if (this instanceof Boormachine) {
            verzekeringsInformatie = setVerzekeringInformatieBoormachine();
        }

       
        
       
    }
    public String getVerzekeringsInformatie(){
        return verzekeringsInformatie;
    }

    public String setVerzekeringInformatieVrachtAuto(){
        return "De verzekering is afhankelijk van het gewicht van de auto en bedraagt 0,01 euro per kg per dag.";
    }

    public String setVerzekeringInformatiePersononAuto(){
        return "De verzekering is afhankelijk van het gewicht van de auto en bedraagt 0,01 euro per kg per dag.";
    }

    public String setVerzekeringInformatieBoormachine(){
        return "De verzekering is 1 euro per dag.";
    }

    public String setVerzekeringInformatieOnbekendProduct(){
        return "De verzekering is niet beschikbaar.";
    }


}
   
