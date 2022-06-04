package com.example.demo;

import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class BeheerController {
    Seed seed = new Seed();
    ArrayList<ProductFactory> productFactories = seed.getsoortenProducten();
    @FXML
    private ListView<String> listViewSoortenProducten;

    @FXML
    private Button toevoegenProductTypen;


    @FXML
    void initialize() {
        fillListViewSoortenProducten();

    }

    public void fillListViewSoortenProducten() {
        
        for(ProductFactory pf : productFactories) {
            System.out.println(pf.getNaamTypeProduct());
            listViewSoortenProducten.getItems().add(pf.getNaamTypeProduct());
        }
    }
}
