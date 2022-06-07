package com.example.demo;

public class PersonenAutoFactory extends ProductFactory {
    private String naamTypeProduct = "PersonenAuto";
    private double prijsPerDag = 50.00;
    private double verzekering = 0.01;

    @Override
    public Product createProduct(String z , String x) {
        return new PersonenAuto(z , (Integer.parseInt(x)) , prijsPerDag , verzekering);
    }

    @Override
    String getNaamTypeProduct() {
        
        return naamTypeProduct;
    }  
}
    

