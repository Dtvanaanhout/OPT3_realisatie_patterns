package com.example.demo;

import java.util.Observer;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class DetailController implements Observer {
    
     Product product;
    Medewerker medewerker;
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
    private Text MedewerkerVerhuur;

    @FXML
    private Text verhuurdDoorText;

    @FXML
    void initialize() {
        product = OverzichtController.product;
        medewerker=LoginController.getMedewerkerIngelogd();
        setProductGegevens();
        
        product.addObserver(this);
        }

    public void setProductGegevens(){
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
        verhuurdDoorText.setVisible(true);
        gehuurdDoorTextField.setVisible(true);
        klantInfoText.setVisible(true);
        klantInfoText.setText(product.getKlant().getVoorNaam() + " " + product.getKlant().getAchterNaam());
        retourButton.setVisible(true);
        verhuurPane.setVisible(false);
        MedewerkerVerhuur.setVisible(true);
        
    }
    

    public void setGegevensNietVerhuurd(){
        isVerhuurdText.setText("Niet verhuurd");
        retourButton.setVisible(false);
        klantInfoText.setVisible(false);
        gehuurdDoorTextField.setVisible(false);
        verhuurPane.setVisible(true);
        verhuurdDoorText.setVisible(false);
        MedewerkerVerhuur.setVisible(false);
    }

    public void retourButtonClicked(){
        product.setVerhuurStatus(false , null);
        setGegevensNietVerhuurd();
    }

    public void VerhuurButtonClicked(){
        product.setVerhuurStatus(true, new Klant(voornaamKlantTextField.getText(), achternaamKlantTextField.getText()));    
        MedewerkerVerhuur.setText(medewerker.getNaam());
        setGegevensVerhuurd();
    }

    public void berekenPrijsButtonIsClicked(){
        int aantalDagen = Integer.parseInt(aantalDagenVerhurenTextField.getText());
        totalePrijsKosten.setText(product.getprijs(aantalDagen, verzekeringCheckBox.isSelected()) + " euro");
        }

   

    @Override
    public void update(java.util.Observable arg0, Object arg1) {
        System.out.println("update");
        setProductGegevens();
        }
    }


