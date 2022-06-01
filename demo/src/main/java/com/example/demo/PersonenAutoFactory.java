package com.example.demo;

public class PersonenAutoFactory extends ProductFactory {
    
    public Product createProduct(String z , String x , double prijsPerDag , double verzekering) {
        return new PersonenAuto(z , (Integer.parseInt(x)) , prijsPerDag , verzekering);
    }
}
    

