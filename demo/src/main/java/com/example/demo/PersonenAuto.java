package com.example.demo;

public class PersonenAuto extends Product{
    private String merk;
    private double gewicht;
    private double verzekering = 0.01;
    private double prijsPerDag = 50.00;
    private boolean verhuurStatus = false;
    
    public PersonenAuto(String merk, double gewicht){
        this.merk = merk;
        this.gewicht = gewicht;
       
    }

    @Override
    double getprijs(int aantalDagenHuren, boolean isVerzekerd) {
        double totaal = prijsPerDag * aantalDagenHuren;
        if (isVerzekerd) {
            totaal += verzekering * gewicht;
        }
        return totaal;
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
        return "Personenauto van het " + merk + "met een van gewicht :" + gewicht;
    }

    @Override
    boolean getVerhuurStatus() {
       
        return verhuurStatus;
    }

    @Override
    void setVerhuurStatus(boolean status) {
        this.verhuurStatus=status;
    }

}