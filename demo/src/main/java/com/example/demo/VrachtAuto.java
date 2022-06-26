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
        super.setInformatie();
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
    public void setDiscription() {
        description =  "Vrachtauto met een laad vermogen van: " + laadvermogen + "KG met een gewicht van : " + gewicht + " kg";
    }

    @Override
        void setVerhuurStatus(boolean status , Klant klant) {
            super.verhuurStatus=status;
            super.klant=klant;
        notifyObservers();
        }
    @Override
        public void setVerzekeringInformatie(){
            verzekeringsInformatie = "De verzekering is afhankelijk van het gewicht van de auto en bedraagt 0,01 euro per kg per dag.";
        }
        @Override
        public void setNaam() {
            naam =  "Vraachtauto " + gewicht + " laadvermogen plus een gewicht van :" + laadvermogen;
           }  
           
        @Override
        public String getDescription() {
               return super.description;
           }
    }
 


   
