package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    static Medewerker loginMedewerker;
    
    @FXML
    private TextField UserNameTextField;
    
    @FXML
    private Button LoginButton;

    @FXML
    protected void onLoginClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
        Stage stage = new Stage();
        stage.setTitle("Menu");
        stage.setScene(scene);
        stage.show();   
        String naam = UserNameTextField.getText();
        loginMedewerker = new Medewerker(naam);
        }   

        public static Medewerker getLoginMedewerker(){
            return loginMedewerker;
        }
    }