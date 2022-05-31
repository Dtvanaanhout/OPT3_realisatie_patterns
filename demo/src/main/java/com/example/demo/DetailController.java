package com.example.demo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;

public class DetailController {
    Product product;
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void initialize() {
        getProductenSelected();
        }
    public void getProductenSelected(){
         product = OverzichtController.product;
            
        }
        
    }



