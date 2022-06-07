package com.example.demo;

import java.util.ArrayList;
import java.util.Observer;

public class VrachtAuto extends Product  {
    
    private double laadvermogen;
    private double gewicht;
    private double verzekering;
    private double prijsPerDag;
    private boolean verhuurStatus=false;
    Klant klant;
    ArrayList<Observer> observers = new ArrayList<Observer>();
    public VrachtAuto(double laadvermogen, double gewicht, double prijsPerDag, double verzekering){
        this.laadvermogen = laadvermogen;
        this.gewicht = gewicht;
        this.prijsPerDag = prijsPerDag;
        this.verzekering=verzekering;
    }

    public double getprijs(int aantalDagenHuren , boolean isVerzekerd){
        double totaal = (laadvermogen * prijsPerDag) * aantalDagenHuren;
        if(isVerzekerd){
            totaal += (verzekering * gewicht) * aantalDagenHuren;
        }
        return totaal;
    }

    public double getLaadvermogen() {
        return laadvermogen;
    }

    public double getGewicht() {
        return gewicht;
    }

    @Override
    String getDiscription() {
        return "Vrachtauto met een laad vermogen van: " + laadvermogen + "KG met een gewicht van : " + gewicht + " kg";
    }

    @Override
    String getNaam() {
        return  "Vraachtauto " + laadvermogen + " laadvermogen plus een gewicht van :" + gewicht;
    }

    @Override
    boolean getVerhuurStatus() {
        
        return verhuurStatus;
    }

    @Override
    void setVerhuurStatus(boolean status , Klant klant) {
        this.verhuurStatus=status;
        this.klant=klant;
        notifyObservers();
    }

    @Override
    String getVerzekeringsInformatie() {
        return "De verzekering is : " + verzekering + " euro per kg gewicht";
    }

    @Override
    Klant getKlant() {
        return klant;
    }

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