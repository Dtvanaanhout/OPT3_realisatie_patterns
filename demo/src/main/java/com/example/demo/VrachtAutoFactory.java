package com.example.demo;


public class VrachtAutoFactory extends ProductFactory {
    private String naamTypeProduct = "VrachtAuto";

    public Product createProduct(String z , String x) {
        return new VrachtAuto(Double.parseDouble(z), Double.parseDouble(x));
    }
    
    @Override
    String getNaamTypeProduct() {
        
        return naamTypeProduct;
    }  
}
    

