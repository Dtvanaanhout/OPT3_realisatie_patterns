package com.example.demo;


import javafx.fxml.FXML;

public class DetailController {
    OverzichtController OC = new OverzichtController();
    Product product = OC.product;


    @FXML
    void initialize() {
    System.out.println(product.getNaam());
        }
    }



