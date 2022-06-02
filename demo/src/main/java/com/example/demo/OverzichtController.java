package com.example.demo;

import java.io.IOException;
import java.util.ArrayList;


import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class OverzichtController{
Seed seed = new Seed();
static Product product;
 ArrayList<Product> producten = seed.getProducten();

    @FXML ListView<String> lijstProducten;

    @FXML
    private Text description;

    @FXML
    private Text verhuurStatus;

    @FXML
    private void initialize() {
        fillList();
    }
    public void fillList(){
        for(Product p : producten){
            lijstProducten.getItems().add(p.getNaam());
        }
    }

    public void fillDescription(Product product){
        description.setText(product.getDiscription());
    }

    public void clickList(){
        lijstProducten.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                verhuurStatus.setText(producten.get(lijstProducten.getSelectionModel().getSelectedIndex()).getVerhuurStatus() + "");
                description.setText(producten.get(lijstProducten.getSelectionModel().getSelectedIndex()).getDiscription());
                product = producten.get(lijstProducten.getSelectionModel().getSelectedIndex());
            }
        });
    }

    public void getDetailScherm() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Detail.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        Stage stage = new Stage();
        stage.setTitle(product.getNaam());
        stage.setScene(scene);
        stage.show();   
    }
   
    }

          
    
   
 