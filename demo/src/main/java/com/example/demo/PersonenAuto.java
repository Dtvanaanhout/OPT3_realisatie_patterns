package com.example.demo;

import java.util.ArrayList;
import java.util.Observer;



public class PersonenAuto extends Product {
    private String merk;
    private double gewicht;    
    Klant klant;
    PrijsCalc pc;
    public PersonenAuto(String merk, double gewicht ){
        this.merk = merk;
        this.gewicht = gewicht;
        this.pc = new PrijsCalc(50, 0.01);
    }

 
    double getprijs(int aantalDagenHuren, boolean isVerzekerd) {
        return pc.getPrijs_PersonenAuto(aantalDagenHuren, isVerzekerd, gewicht);
    }

    public String getMerk() {
        return merk;
    }
    public double getGewicht() {
        return gewicht;
    }

    @Override
    String getDiscription() {
        return "Personenauto van het merk : " + merk + " met een gewicht van : " + gewicht + " kg ";
    }

    @Override
    String getNaam() {
        return "Auto merk : " + merk + " Gewicht :" + gewicht;
    }
    @Override
    public String getVerzekeringsInformatie(){
        return "De verzekering is : " + pc.getVerzekering() + " euro per kg";
    }

    @Override
    void setVerhuurStatus(boolean status , Klant klant) {
        super.verhuurStatus=status;
        super.klant=klant;
        notifyObservers();
    }
}