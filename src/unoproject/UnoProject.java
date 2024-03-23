/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 * Source: https://github.com/GabrielWeinbrenner/UNO-in-JAVA
 */
package unoproject;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * Get this thing saved
 * @author murra
 */
public class UnoProject extends Application {
    
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(FXMLDocumentController.class.getResource("UnoInterface.fxml")); 
                 
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("Uno Computer Game");
        stage.sizeToScene();
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
       
}
