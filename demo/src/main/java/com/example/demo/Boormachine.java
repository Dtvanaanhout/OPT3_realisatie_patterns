package com.example.demo;

public class Boormachine extends Product {
    private String type;
    private String merk;
    private double verzekering = 1.0;
    private double prijsPerDag = 5.00;
    private boolean verhuurStatus = false;
    Klant klant;
    public Boormachine(String type, String merk) {
        this.type = type;
        this.merk = merk;
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
    void setVerhuurStatus(boolean status) {
        this.verhuurStatus=status;
    }

    @Override
    void setKlant(Klant klant) {
        this.klant = klant;
    }
    
}

