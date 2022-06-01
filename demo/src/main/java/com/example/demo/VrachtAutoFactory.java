package com.example.demo;


public class VrachtAutoFactory extends ProductFactory {
    
    public Product createProduct(String z , String x , double prijsPerDag , double verzekering) {
        return new VrachtAuto(Double.parseDouble(z), Double.parseDouble(x) ,  prijsPerDag , verzekering);
    }
    
}
    

