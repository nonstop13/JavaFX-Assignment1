/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package worldflags;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author MSI
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private Button button1;
    @FXML
    private Button button11;
    @FXML
    private Button button12;
    @FXML
    private Button button13;
    @FXML
    private ImageView image;
    @FXML
    private Label text;
    @FXML
    private Button clear;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    
    @FXML
    private void ChinaButtonAction(ActionEvent event) {
         Image myImage = new Image(getClass().getResourceAsStream("china.jpg"));
         
          image.setImage(myImage);
           text.setText("China");
    }

    @FXML
    private void LesothoButtonAction(ActionEvent event) {
        Image myImage = new Image(getClass().getResourceAsStream("lesotho.jpg"));
      
        image.setImage(myImage);
         text.setText("Lesotho");
    }

    @FXML
    private void UsaButtonAction(ActionEvent event) {
        Image myImage = new Image(getClass().getResourceAsStream("usa.jpg"));
        
        image.setImage(myImage);
         text.setText("USA");
    }

    @FXML
    private void BrazilButtonAction(ActionEvent event) {
        Image myImage = new Image(getClass().getResourceAsStream("brazil.jpg"));
        
        image.setImage(myImage);
        text.setText("Brazil");
    }

    @FXML
    private void FranceButtonAction(ActionEvent event) {
        Image myImage = new Image(getClass().getResourceAsStream("france.jpg"));
        
        image.setImage(myImage);
        text.setText("France");
    } 

    @FXML
    private void ClearButtonAction(ActionEvent event) {
        image.setImage(null);
        text.setText(null);
    }
}
