package com.example.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class OverzichtController implements Observer {
Seed seed = new Seed();
static Product product;

 ArrayList<Product> producten;

    @FXML ListView<String> lijstProducten;

    @FXML
    private Text description;

    @FXML
    private Text verhuurStatus;

    @FXML
    private void initialize() {
        fillList();
        seed.addObserver(this);
    }
    public void fillList(){
        producten = seed.getProducten();
        for(Product p : producten){
            lijstProducten.getItems().add(p.getNaam());
        }
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
    @Override
    public void update(Observable arg0, Object arg1) {
        System.out.println("update");
        fillList();
        }
    }

          
    
   
 