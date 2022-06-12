package com.example.demo;

public class PersonenAutoFactory extends ProductFactory {
    private String naamTypeProduct = "PersonenAuto";


    @Override
    public Product createProduct(String z , String x) {
        return new PersonenAuto(z , (Integer.parseInt(x)));
    }

    @Override
    String getNaamTypeProduct() {
        
        return naamTypeProduct;
    }  
}
    

