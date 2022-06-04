package com.example.demo;

public class BoormachineFactory extends ProductFactory{

    private String naamTypeProduct = "Boormachine"; 

    @Override
    public Product createProduct(String z , String x ,double prijsPerDag , double verzekering) {
        return new Boormachine(z , x , prijsPerDag , verzekering);
    }

    @Override
    String getNaamTypeProduct() {
        
        return naamTypeProduct;
    }  
    
}
