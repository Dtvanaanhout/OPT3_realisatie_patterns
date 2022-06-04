package com.example.demo;


public class VrachtAutoFactory extends ProductFactory {
    private String naamTypeProduct = "VrachtAuto";
    
    public Product createProduct(String z , String x , double prijsPerDag , double verzekering) {
        return new VrachtAuto(Double.parseDouble(z), Double.parseDouble(x) ,  prijsPerDag , verzekering);
    }
    
    @Override
    String getNaamTypeProduct() {
        
        return naamTypeProduct;
    }  
}
    

