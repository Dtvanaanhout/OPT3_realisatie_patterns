package com.example.demo;

import java.util.ArrayList;
import java.util.Observer;

public class Boormachine extends Product {
    private String type;
    private String merk;
    private boolean verhuurStatus = false;
    Klant klant;
    ArrayList<Observer> observers = new ArrayList<Observer>();
    PrijsCalc pc;
    public Boormachine(String type, String merk){
        this.type = type;
        this.merk = merk;
        this.pc= new PrijsCalc(5, 1);
    }

    public double getprijs(int aantalDagenHuren, boolean isVerzekerd) {
        return pc.getPrijs_Boormachine(aantalDagenHuren, isVerzekerd);
    }

    public String getType() {
        return type;
    }
    public String getMerk() {
        return merk;
    }

    @Override
    public String getDiscription() {
        
        return "Boormachine van het type : " + type + " van het merk : " + merk;
    }

    @Override
    public String getNaam() {
        
        return "Boormachine van het type : " + type + " en van het merk :" + merk;
    }

    @Override
    public boolean getVerhuurStatus() {
        
        return verhuurStatus;
    }

    @Override
   public void setVerhuurStatus(boolean status , Klant klant) {
        this.verhuurStatus=status;
        this.klant=klant;
        notifyObservers();
    }

    @Override
   public  String getVerzekeringsInformatie() {
        return "De verzekering is : " + pc.getVerzekering() + " euro per dag";
    }    
    
    @Override
   public Klant getKlant() {
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

