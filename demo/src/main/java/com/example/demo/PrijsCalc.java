package com.example.demo;

public class PrijsCalc {
    private double verzekering;
    private double prijsPerDag;

    public PrijsCalc( double prijsPerDag, double verzekering){
        this.prijsPerDag=prijsPerDag;
        this.verzekering=verzekering;
    }


    public double getPrijs_PersonenAuto(int aantalDagenHuren, boolean isVerzekerd , double gewicht){
        double totaal = prijsPerDag * aantalDagenHuren;
        if (isVerzekerd) {
            totaal += (verzekering * gewicht) * aantalDagenHuren;
        }
        return totaal;
    }

    public double getVerzekering() {
        return verzekering;
    }

    public double getPrijs_Boormachine (int aantalDagenHuren, boolean isVerzekerd){
        
            double totaal = prijsPerDag * aantalDagenHuren;
            if (isVerzekerd) {
                totaal += verzekering * aantalDagenHuren;
            }
            return totaal;
        }


    public double getPrijs_VrachtAuto(int aantalDagenHuren, boolean isVerzekerd , double laadvermogen , double gewicht){
        double totaal = (laadvermogen * prijsPerDag) * aantalDagenHuren;
        if(isVerzekerd){
            totaal += (verzekering * gewicht) * aantalDagenHuren;
        }
        return totaal;
    }

    public double getVerzekering_VrachtAuto(double laadvermogen , double gewicht){
        return (verzekering * gewicht) * laadvermogen;
    }
}

