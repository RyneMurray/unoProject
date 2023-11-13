/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package unoproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

/**
 *
 * @author murra
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    
    @FXML
    private AnchorPane Anchor;
    @FXML
    private ImageView start;
    @FXML
    private StackPane discardPile;
    @FXML
    private HBox computerHBox;
    @FXML
    private StackPane drawPile;
    @FXML
    private Button drawButton;
    @FXML
    private TextArea txtField;
    @FXML
    private Button red;
    @FXML
    private Button green;
    @FXML
    private Button yellow;
    @FXML
    private Button blue;
    @FXML
    private HBox controlledPlayerHBox;
    @FXML
    private ImageView logo;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleStartButton(MouseEvent event) {
    }

    @FXML
    private void drawClicked(MouseEvent event) {
    }

    @FXML
    private void redClicked(MouseEvent event) {
    }

    @FXML
    private void greenClicked(MouseEvent event) {
    }

    @FXML
    private void yellowClicked(MouseEvent event) {
    }

    @FXML
    private void blueClicked(MouseEvent event) {
    }

    @FXML
    private void select(MouseEvent event) {
    }

    @FXML
    private void mouseMoved(MouseEvent event) {
    }
    
}
