package com.example.demo;

public class BoormachineFactory extends ProductFactory{

    private String naamTypeProduct = "Boormachine"; 
    private double prijsPerDag = 5.00;
    private double verzekering = 1.00;
    
    @Override
    public Product createProduct(String z , String x) {
        return new Boormachine(z , x , prijsPerDag , verzekering);
    }

    @Override
    String getNaamTypeProduct() {
        
        return naamTypeProduct;
    }  
    
}
