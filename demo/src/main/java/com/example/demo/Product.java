package com.example.demo;

abstract class Product{
    abstract double getprijs(int aantalDagenHuren , boolean isVerzekerd);
    abstract String getDiscription();
    abstract String getNaam();
    abstract boolean getVerhuurStatus();
    abstract void setVerhuurStatus(boolean status);
    abstract void setKlant(Klant klant);
    }
