package com.example.demo;

import java.util.ArrayList;

public class VrachtAuto extends Product{
    
    private double laadvermogen;
    private double gewicht;
    private double verzekering = 0.01;
    private double prijsPerDag = 0.10;
    private boolean verhuurStatus=false;
    Klant klant;
    ArrayList<Observer> observers = new ArrayList<>();
    public VrachtAuto(double laadvermogen, double gewicht){
        this.laadvermogen = laadvermogen;
        this.gewicht = gewicht;
    }

    public double getprijs(int aantalDagenHuren , boolean isVerzekerd){
        double totaal = (laadvermogen * prijsPerDag) * aantalDagenHuren;
        if(isVerzekerd){
            totaal += verzekering * gewicht;
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
    public void attach(Observer o) {
        observers.add(o);
        
    }

    @Override
    public void detach(Observer o) {
       observers.remove(o);
        
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(this);
        }
        
    }
}