package com.example.demo;

import java.util.ArrayList;
import java.util.Observer;

public class Boormachine extends Product {
    private String type;
    private String merk;
    private double verzekering;
    private double prijsPerDag;
    private boolean verhuurStatus = false;
    Klant klant;
    ArrayList<Observer> observers = new ArrayList<Observer>();
    
    public Boormachine(String type, String merk , double prijsPerDag , double verzekering){
        this.type = type;
        this.merk = merk;
        this.prijsPerDag = prijsPerDag;
        this.verzekering = verzekering;

    }

    public double getprijs(int aantalDagenHuren, boolean isVerzekerd) {
        double totaal = prijsPerDag * aantalDagenHuren;
        if (isVerzekerd) {
            totaal += verzekering * aantalDagenHuren;
        }
        return totaal;
    }

    public String getType() {
        return type;
    }
    public String getMerk() {
        return merk;
    }

    @Override
    String getDiscription() {
        
        return "Boormachine van het type : " + type + " van het merk : " + merk;
    }

    @Override
    String getNaam() {
        
        return "Boormachine van het type : " + type + " en van het merk :" + merk;
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
        return "De verzekering is : " + verzekering + " euro per dag";
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

