package com.example.demo;

public class BoormachineFactory extends ProductFactory{

    @Override
    public Product createProduct(String z , String x ,double prijsPerDag , double verzekering) {
        return new Boormachine(z , x , prijsPerDag , verzekering);
    }  
    
}
