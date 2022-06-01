package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class DetailController {
    Product product;
    @FXML
    private Button VerhuurButton;

    @FXML
    private TextField aantalDagenVerhurenTextField;

    @FXML
    private TextField achternaamKlantTextField;

    @FXML
    private Text beschrijvingText;

    @FXML
    private Text gehuurdDoorTextField;

    @FXML
    private Text isVerhuurdText;

    @FXML
    private Text klantInfoText;

    @FXML
    private Text kostenVerzekeringText;

    @FXML
    private Text naamProductText;

    @FXML
    private Text prijsPerDagText;

    @FXML
    private Button retourButton;

    @FXML
    private CheckBox verzekeringCheckBox;

    @FXML
    private TextField voornaamKlantTextField;

    @FXML
    void initialize() {
        setProductGegevens();
        }

    public void setProductGegevens(){
        product = OverzichtController.product;
        beschrijvingText.setText(product.getDiscription());
        naamProductText.setText(product.getNaam());
       // product.setVerhuurStatus(true , new Klant ("Jan" , "Janssen"));
        prijsPerDagText.setText(product.getprijs(1, false) + " euro");   
        kostenVerzekeringText.setText(product.getVerzekeringsInformatie());
        if(product.getVerhuurStatus()){
            setGegevensVerhuurd();
        }
        else {
            setGegevensNietVerhuurd();
        }
    }

    public void setGegevensVerhuurd(){
        isVerhuurdText.setText("Verhuurd");
        klantInfoText.setText(product.getKlant().getVoorNaam() + " " + product.getKlant().getAchterNaam());
        retourButton.setVisible(true);
        VerhuurButton.setVisible(false);
        verzekeringCheckBox.setVisible(false);
        aantalDagenVerhurenTextField.setVisible(false);
        achternaamKlantTextField.setVisible(false);
        voornaamKlantTextField.setVisible(false);

    }
    

    public void setGegevensNietVerhuurd(){
        isVerhuurdText.setText("Niet verhuurd");
        klantInfoText.setVisible(false);
        gehuurdDoorTextField.setVisible(false);
        retourButton.setVisible(false);
        VerhuurButton.setVisible(true);
    }

    public void retourButtonClicked(){
        product.setVerhuurStatus(false , null);
        setGegevensNietVerhuurd();
    }

    public void VerhuurButtonClicked(){
        
        
        setGegevensVerhuurd();
    }
}



