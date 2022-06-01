package com.example.demo;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MenuController {
    
    @FXML
    private Text LoginMedewerkerText;

    @FXML
    private Button OverzichtButton;

    @FXML
    private Button beheerButton;

    @FXML
    private Button uitlogButton;
    
    @FXML
    void initialize() {
           LoginController LC = new LoginController();
           
    }
    @FXML
    public void uitlogButtonClick(){
        Stage stage = (Stage) uitlogButton.getScene().getWindow();
        stage.close();
    }

    public void OverzichtButtonClick() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Overzicht.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        Stage stage = new Stage();
        stage.setTitle("Overzicht");
        stage.setScene(scene);
        stage.show();   
    }
}
