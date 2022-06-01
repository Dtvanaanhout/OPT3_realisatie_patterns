package com.example.demo;

import javafx.fxml.FXML;

public class DetailController {
    OverzichtController OC = new OverzichtController();
    Product product;
    @FXML
    void initialize() {
        
       
    }
    
        public Product getProductenSelected(){
    
            return OC.product;
        }
        
    }



