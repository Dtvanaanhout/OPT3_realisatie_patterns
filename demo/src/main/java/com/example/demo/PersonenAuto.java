package com.example.demo;






public class PersonenAuto extends Product {
    private String merk;
    private double gewicht;    
    Klant klant;
    PrijsCalc pc;
    
    public PersonenAuto(String merk, double gewicht ){
        this.merk = merk;
        this.gewicht = gewicht;
        this.pc = new PrijsCalc(50, 0.01);
        setInformatie();
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
    String getDescription() {
        return "Personenauto van het merk : " + merk + " met een gewicht van : " + gewicht + " kg ";
    }
    @Override
    void setVerhuurStatus(boolean status , Klant klant) {
        super.verhuurStatus=status;
        super.klant=klant;
        notifyObservers();
    }
    @Override
    public void setVerzekeringInformatie(){
        verzekeringsInformatie =  "De verzekering is afhankelijk van het gewicht van de auto en bedraagt 0,01 euro per kg per dag.";
    }

    @Override
    public void setNaam(){
        
            naam =  "Auto merk : " +merk + " Gewicht :" + gewicht;
    }
}
