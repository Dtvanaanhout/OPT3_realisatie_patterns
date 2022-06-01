package com.example.demo;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class DetailController{
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
    private Text totalePrijsKosten;

    @FXML
    private CheckBox verzekeringCheckBox;

    @FXML
    private TextField voornaamKlantTextField;
    @FXML
    private Button berekenPrijsButton;

    @FXML
    private Pane verhuurPane;

    @FXML
    void initialize() {
        setProductGegevens();
        }

    public void setProductGegevens(){
        product = OverzichtController.product;
        beschrijvingText.setText(product.getDiscription());
        naamProductText.setText(product.getNaam());
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
        gehuurdDoorTextField.setVisible(true);
        klantInfoText.setVisible(true);
        klantInfoText.setText(product.getKlant().getVoorNaam() + " " + product.getKlant().getAchterNaam());
        retourButton.setVisible(true);
        verhuurPane.setVisible(false);
        
    }
    

    public void setGegevensNietVerhuurd(){
        isVerhuurdText.setText("Niet verhuurd");
        retourButton.setVisible(false);
        klantInfoText.setVisible(false);
        gehuurdDoorTextField.setVisible(false);
        verhuurPane.setVisible(true);
    }

    public void retourButtonClicked(){
        product.setVerhuurStatus(false , null);
        setProductGegevens();
    }

    public void VerhuurButtonClicked(){
        product.setVerhuurStatus(true, new Klant(voornaamKlantTextField.getText(), achternaamKlantTextField.getText()));    
        setProductGegevens();
    }

    public void berekenPrijsButtonIsClicked(){
        int aantalDagen = Integer.parseInt(aantalDagenVerhurenTextField.getText());
        totalePrijsKosten.setText(product.getprijs(aantalDagen, verzekeringCheckBox.isSelected()) + " euro");
    }
    

    }


