/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unoproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.fxml.Initializable;

/**
 *
 * @author murra
 */
public class UnoActions implements Initializable {
        private int index;
        private UnoController control = new UnoController();
        private boolean isWild;
        private boolean youWon = false;
        
        @FXML
        private AnchorPane Anchor;
        
        @FXML
        private TextArea txtField;
        
        @FXML
        private StackPane drawPile;
        
        @FXML
        private StackPane discardPile;
                
        @FXML
        private HBox controlledPlayerHBox;
               
        @FXML
        private HBox computerHBox;
                
        @FXML
        private Button drawButton;
               
        @FXML
        private Button red;
                
        @FXML
        private Button yellow;
                
        @FXML
        private Button green;
                
        @FXML
        private Button blue;
        
        @FXML
        private ImageView start;
        
        @FXML
        private ImageView logo;
        
        
        
    @Override    
    public void initialize (URL location, ResourceBundle resources) {
        
    }
}
