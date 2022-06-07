package com.example.demo;

import java.util.ArrayList;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


public class BeheerController  {
    Seed seed = new Seed();
    ArrayList<ProductFactory> productFactories = seed.getsoortenProducten();
    
    @FXML
    private ListView<String> listViewSoortenProducten;

    @FXML
    private Button toevoegenProductTypen;

    @FXML
    private TextField TextField1;

    @FXML
    private TextField TextField2;

    @FXML
    void initialize() {
        fillListViewSoortenProducten();
    }

    public void fillListViewSoortenProducten() {
        for(ProductFactory pf : productFactories) {
            listViewSoortenProducten.getItems().add(pf.getNaamTypeProduct());
        }
    }

    public void addProduct(){
        String selectedItem = listViewSoortenProducten.getSelectionModel().getSelectedItem();
        for(ProductFactory pf : productFactories) {
            if(pf.getNaamTypeProduct().equals(selectedItem)) {
                seed.addProductenToArray(pf.createProduct(TextField1.getText() , TextField2.getText()));
            }
                System.out.println("new product toegevoegd");
        }
        
    }

}
