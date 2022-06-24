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
        if(this instanceof VrachtAuto) {
            naam = setNaamVrachtAuto();
            verzekeringsInformatie = setVerzekeringInformatieVrachtAuto();
        }
        else if(this instanceof PersonenAuto) {
            naam = setNaamPersonenAuto();
            verzekeringsInformatie = setVerzekeringInformatiePersononAuto();
        }
        else if (this instanceof Boormachine) {
            naam = setNaamBoorMachine();
            verzekeringsInformatie = setVerzekeringInformatieBoormachine();
        }
        else {
            verzekeringsInformatie = setVerzekeringInformatieOnbekendProduct();
            naam = setNaamOnbekend();
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

   public String setNaamOnbekend(){
    return "Onbekend product";
   }
   public String setNaamVrachtAuto(){
    return  "Vraachtauto " + ((VrachtAuto)this).getGewicht() + " laadvermogen plus een gewicht van :" + ((VrachtAuto)this).getLaadvermogen();
   }

   public String setNaamPersonenAuto(){
    return "Auto merk : " +((PersonenAuto) this ).getMerk() + " Gewicht :" + ((PersonenAuto) this ).getGewicht();
   }

   public String setNaamBoorMachine(){
    return "Boormachine van het type : " + ((Boormachine)this).getType() + " en van het merk :" + ((Boormachine)this).getMerk();
   }
}
   
