package com.example.demo;

import java.util.ArrayList;
import java.util.Observer;

public class Boormachine extends Product {
    private String type;
    private String merk;
    
    Klant klant;
    PrijsCalc pc;
    public Boormachine(String type, String merk){
        this.type = type;
        this.merk = merk;
        this.pc= new PrijsCalc(5, 1);
        super.setInformatie();
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
        return super.naam;
        
    }

    

    @Override
    void setVerhuurStatus(boolean status , Klant klant) {
        super.verhuurStatus=status;
        super.klant=klant;
        notifyObservers();
    } 

}

