package com.example.demo;

public abstract class ProductFactory {
    public static final PersonenAutoFactory PERSONENAUTO_FACTORY = new PersonenAutoFactory();
    public static final BoormachineFactory BOORMACHINE_FACTORY = new BoormachineFactory();
    public static final VrachtAutoFactory VRACHTAUTO_FACTORY = new VrachtAutoFactory();
    
    public abstract Product createProduct(String x , String z , double prijsPerDag , double verzekering); 
}
