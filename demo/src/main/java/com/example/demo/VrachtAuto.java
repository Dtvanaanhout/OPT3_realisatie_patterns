package com.example.demo;

public class VrachtAuto extends Product{
    
    private double laadvermogen;
    private double gewicht;
    private double verzekering = 0.01;
    private double prijsPerDag = 0.10;
    private boolean verhuurStatus=false;
    Klant klant;
   
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
        return "Vrachtauto met een laad vermogen van  : " + laadvermogen + "KG met een gewicht van : " + gewicht + " kg";
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
    }
}