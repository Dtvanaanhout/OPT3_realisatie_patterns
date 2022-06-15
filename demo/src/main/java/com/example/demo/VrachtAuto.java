package com.example.demo;

import java.util.ArrayList;
import java.util.Observer;

public class VrachtAuto extends Product  {
    
    private double laadvermogen;
    private double gewicht;
    Klant klant;
    ArrayList<Observer> observers = new ArrayList<Observer>();
    PrijsCalc pc;
    
    public VrachtAuto(double laadvermogen, double gewicht){
        this.laadvermogen = laadvermogen;
        this.gewicht = gewicht;
        this.pc=new PrijsCalc(0.10, 0.01);
    }
    
    public double getprijs(int aantalDagenHuren , boolean isVerzekerd) {
        return pc.getPrijs_VrachtAuto(aantalDagenHuren, isVerzekerd, laadvermogen, gewicht);
        
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
    void setVerhuurStatus(boolean status , Klant klant) {
        super.verhuurStatus=status;
        super.klant=klant;
        notifyObservers();
    }

    @Override
    String getVerzekeringsInformatie() {
        return "De verzekering is : " + pc.getVerzekering() + " euro per kg gewicht";
    }
    }


   
