package com.example.demo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;

public class DetailController {
    OverzichtController OC = new OverzichtController();
    Product product = OC.producten.get(OC.lijstProducten.getSelectionModel().getSelectedIndex());
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void initialize() {
    System.out.println(product.getNaam());
        }
    }



