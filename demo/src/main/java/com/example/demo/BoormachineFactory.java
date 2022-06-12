package com.example.demo;

public class BoormachineFactory extends ProductFactory{

    private String naamTypeProduct = "Boormachine"; 
    
    @Override
    public Product createProduct(String z , String x) {
        return new Boormachine(z , x );
    }

    @Override
    String getNaamTypeProduct() {
        
        return naamTypeProduct;
    }  
    
}
