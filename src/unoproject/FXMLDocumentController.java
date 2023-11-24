/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package unoproject;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
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
    private int Index;
    private UnoController controller = new UnoController();
    private boolean wildCard;
    private boolean gameOver = false;
    //create win condition
    
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
    
    private void playerHandle(MouseEvent event) {
        
    }
    
    private void autoHandle() {
        
    }
    
    private void setEndGame(boolean b) {
        if (b == true) {
            gameOver = true;
        } else if (b == false) {
            gameOver = false;
        }
    }
    //make discard functions
    public void playerDiscard(int n) {
        controller.cards().getDiscardPile().push(controller.getRealPlayer().remove(controller.getRealPlayer().getCards().get(n)));
        discardPile.getChildren().add(controlledPlayerHBox.getChildren().remove(n));
    }
    
    public void autoDiscard(int n) {
        if(controller.match(controller.getAutoPlayer().getCards().get(n))) {
            ImageView brief = new ImageView(controller.getAutoPlayer().getCards().get(n).getCardFace());
            controller.cards().getDiscardPile().push(controller.getAutoPlayer().getCards().remove(n));
            computerHBox.getChildren().remove(n);
            discardPile.getChildren().add(brief);
        }
    }
    
    public void visibility(boolean b) {
        if ( b == true) {
            txtField.setStyle(txtField.getStyle() + "visibility: visible");
            drawPile.setStyle(drawPile.getStyle() + "visibility: visible");
            discardPile.setStyle(discardPile.getStyle() + "visibility: visible");
            controlledPlayerHBox.setStyle(controlledPlayerHBox.getStyle() + "visibility: visible");
            computerHBox.setStyle(computerHBox.getStyle() + "visibility: visible");
            drawButton.setStyle(drawButton.getStyle() + "visibility: visible");
        } else if (b == false) {
            txtField.setStyle("visibility: hidden");
            drawPile.setStyle("visibility: hidden");
            discardPile.setStyle("visibility: hidden");
            controlledPlayerHBox.setStyle("visibility: hidden");
            computerHBox.setStyle("visibility: hidden");
            drawButton.setStyle("visibility: hidden");
            logo.setStyle("visibility: hidden");
        }
    }
    
    public void newShuffle() {
        controller.cards().shuffleDrawPile();
        if(discardPile.getChildren().size() > 0) {
            for(int i = 0; i < discardPile.getChildren().size() - 1; i++) {
                discardPile.getChildren().remove(i);
            } 
        }
            for(int i = 0; i < controller.cards().getDrawPile().size(); i++) {
                ImageView brief = new ImageView(controller.cards().getDrawPile().get(i).getCardBack());
                drawPile.getChildren().add(i,brief);
            }
            txtField.setText("Draw Pile shuffled anew");
            txtField.setStyle("-fx-text-fill: red; -fx-font-size: 16px;");
    }
    
    public void playerDraw() {
        ImageView brief = new ImageView(controller.cards().getDrawPile().peek().getCardFace());
        drawPile.getChildren().remove(drawPile.getChildren().size()-1);
        controller.getCurrentPlayer().draw(controller.cards().getDrawPile().pop());
        txtField.setText("\nHere's your card! Computer now auto-drawing card...");
        txtField.setStyle("-fx-text-fill: blue; -fx-font-size: 16px;");
        controller.setCurrentPlayer(controller.getAutoPlayer());
    }
    
    public void autoDraw() {
        ImageView brief = new ImageView(controller.cards().getDrawPile().peek().getCardBack());
        drawPile.getChildren().remove(drawPile.getChildren().size()-1);
        controller.getAutoPlayer().draw(controller.cards().getDrawPile().pop());
        computerHBox.getChildren().add(brief);
        txtField.setText("\nAuto-draw complete. Now it's your turn!");
        txtField.setStyle("-fx-text-fill: blue; -fx-font-size: 16px;");
        controller.setCurrentPlayer(controller.getRealPlayer());
    }
    
    public void dealCards() {
        for(int i = 0; i < 7; i++) {
            playerDraw();
            //create method for player drawing card DONE
            autoDraw();
            //create method for computer drawing card DONE
            txtField.setText("Each player begins with seven cards. Good Luck.");
        }
        controller.setCurrentPlayer(controller.getRealPlayer());
    }
    
    public void visibleCard(boolean b) {
        if(b == true) {
            red.setStyle(getCardStyle("red") + "visibility: visible;");
            green.setStyle(getCardStyle("green") + "visibility: visible;");
            yellow.setStyle(getCardStyle("yellow") + "visibility: visible;");
            blue.setStyle(getCardStyle("blue") + "visibility: visible;");
        } else if(b == false) {
            red.setStyle("visibility: hidden");
            green.setStyle("visibility: hidden");
            yellow.setStyle("visibility: hidden");
            blue.setStyle("visibility: hidden");
        }
    }
    
    public String getCardStyle(String color) {
        return ("-fx-background-radius: 5em;\n" +
                "-fx-min-width: 50px;\n" +
                "-fx-min-height: 50px;\n" +
                "-fx-max-width: 50px;\n" +
                "-fx-max-height: 50px;\n" +
                "-fx-background-color:" + color + ";\n" +
                "-fx-border-color: black;\n" +
                "-fx-border-radius: 30;\n" +
                "visibility: hidden;");
    }
      
    @FXML
    private void handleStartButton(MouseEvent event) {
        visibility(true);
        for(int i = 0; i < controller.cards().getDrawPile().size(); i++) {
            ImageView brief = new ImageView(controller.cards().getDrawPile().get(i).getCardBack());
            drawPile.getChildren().add(brief);
        }
        newShuffle();
        //Create newShuffle method DONE
        controller.setCurrentPlayer(controller.getCurrentPlayer());
        dealCards();
        //Create card dealing method DONE
        UnoCard topCard = controller.cards().getDrawPile().peek();
        topCard.setFaceDown(true);
        UnoCard currentCard = controller.cards().getDrawPile().pop();
        ImageView brief = new ImageView(currentCard.getCardFace());
        controller.cards().getDiscardPile().add(currentCard);
        drawPile.getChildren().remove(drawPile.getChildren().size()-1);
        discardPile.getChildren().add(brief);
        Anchor.getChildren().remove(start);
        controller.setCurrentCard(controller.cards().getDiscardPile().peek());
        
    }

    @FXML
    private void drawClicked(MouseEvent event) {
        if(controller.getCurrentPlayer() == controller.getRealPlayer()) {
            playerDraw();
            controller.setCurrentPlayer(controller.getAutoPlayer());
        } 
    }
    
    @FXML
    private void mouseMoved(MouseEvent event) {
        if(wildCard == false) {
            if(controller.getCurrentPlayer() == controller.getAutoPlayer()) {
                autoHandle();
            }
        }
    }
    
    @FXML
    private void redClicked(MouseEvent event) {
        controller.getCurrentCard().setColor("red");
	wildCard = false;
	visibleCard(false);
	txtField.setText("\nThe color is now red");
        txtField.setStyle("-fx-text-fill: red; -fx-font-size: 16px;");
    }

    @FXML
    private void greenClicked(MouseEvent event) {
        controller.getCurrentCard().setColor("green");
	wildCard = false;
	visibleCard(false);
	txtField.setText("\nThe color is now green");
        txtField.setStyle("-fx-text-fill: red; -fx-font-size: 16px;");
    }

    @FXML
    private void yellowClicked(MouseEvent event) {
         controller.getCurrentCard().setColor("yellow");
	wildCard = false;
	visibleCard(false);
	txtField.setText("\nThe color is now yellow");
        txtField.setStyle("-fx-text-fill: red; -fx-font-size: 16px;");
    }

    @FXML
    private void blueClicked(MouseEvent event) {
       controller.getCurrentCard().setColor("blue");
	wildCard = false;
	visibleCard(false);
	txtField.setText("\nThe color is now blue");
        txtField.setStyle("-fx-text-fill: red; -fx-font-size: 16px;");
    }

    @FXML
    private void select(MouseEvent event) {
        if(wildCard == false) {
            ArrayList<ImageView> arr = new ArrayList<ImageView>();
            for(int i = 0; i < controlledPlayerHBox.getChildren().size(); i++) {
                arr.add((ImageView) controlledPlayerHBox.getChildren().get(i));
            }
            for(int i = 0; i < controlledPlayerHBox.getChildren().size(); i++) {
                arr.get(i).setOnMouseClicked(this::playerHandle);
            }
        }
    }

     @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
}
