package com.example.demo;


public class VrachtAutoFactory extends ProductFactory {
    private String naamTypeProduct = "VrachtAuto";
    private double prijsPerDag = 0.10;
    private double verzekering = 0.01;

    public Product createProduct(String z , String x) {
        return new VrachtAuto(Double.parseDouble(z), Double.parseDouble(x) ,  prijsPerDag , verzekering);
    }
    
    @Override
    String getNaamTypeProduct() {
        
        return naamTypeProduct;
    }  
}
    

