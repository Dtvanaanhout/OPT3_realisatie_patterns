package com.example.demo;



public class PersonenAuto extends Product{
    private String merk;
    private double gewicht;
    private double verzekering = 0.01;
    private double prijsPerDag = 50.00;
    private boolean verhuurStatus = false;
    Klant klant;
    
    public PersonenAuto(String merk, double gewicht, double prijsPerDag, double verzekering){
        this.merk = merk;
        this.gewicht = gewicht;
        this.prijsPerDag=prijsPerDag;
        this.verzekering=verzekering;
    }

 
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
        return "Auto merk : " + merk + " Gewicht :" + gewicht;
    }
    @Override
    public String getVerzekeringsInformatie(){
        return "De verzekering is : " + verzekering + " euro per kg";
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
    Klant getKlant() {
        return klant;
    }


}