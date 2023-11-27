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
    private int index;
    private final UnoController controller = new UnoController();
    private boolean wildCard;
    private boolean gameOver = false;
    //create win condition DONE
    
    @FXML
    private AnchorPane Anchor;
    @FXML
    private ImageView start;
    @FXML
    private StackPane discardPile;
    @FXML
    private HBox autoHBox;
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
    private HBox realPlayerHBox;
    @FXML
    private ImageView logo;
    
    private void playerHandle(MouseEvent event) {
        if(gameOver == false) {
            if(controller.getCurrentPlayer() == controller.getRealPlayer()) {
                for(int i = 0; i < 13; i++) {
                    if(realPlayerHBox.getChildren().get(i) == event.getTarget()) {
                        index = i;
                        break;
                    } 
                }
                String realCard = controller.getRealPlayer().getCards().get(index).getName();
                if(controller.getRealPlayer().getCards().get(index).getName().equals("WildPlusFour1")) {
                    playerDiscard(index);
                    controller.setCurrentCard(controller.cards().getDiscardPile().peek());
                    for(int i=0; i < 4; i++) {
                        autoDraw();
                    }
                    txtField.setText("\nYou put down a wild plus four! pick a color: ");
                    txtField.setStyle("-fx-text-fill: red; -fx-font-size: 16px;");
                    if(controller.getCurrentPlayer().getCards().isEmpty()) {
                        txtField.setStyle("-fx-text-fill: green; -fx-font-size: 16px;");
                    }
                    wildCard = true;
                    visibleCard(true);
                    controller.setCurrentPlayer(controller.getAutoPlayer());
                } else if(controller.getRealPlayer().getCards().get(index).getName().equals("Wild1")) {
                    txtField.setText("\nYou put down a wild card! Pick a color: ");
                    txtField.setStyle("-fx-text-fill: red; -fx-font-size: 16px;");
                    playerDiscard(index);
                    controller.setCurrentCard(controller.cards().getDiscardPile().peek());
                    if(controller.getCurrentPlayer().getCards().isEmpty()) {
                        txtField.setText("Game Over. You Win!");
                        setEndGame(true);
                    }
                    wildCard = true;
                    visibleCard(true);
                    controller.setCurrentPlayer(controller.getAutoPlayer());
                }
                System.out.println(realCard.substring(realCard.length()-9, realCard.length()-2));
                if(realCard.substring(realCard.length()-9, realCard.length()-2).equals("PlusTwo") &&
                    controller.match(controller.getRealPlayer().getCards().get(index))) {
                    controller.cards().getDiscardPile().push(controller.getRealPlayer().getCards().get(index));
                    playerDiscard(index);
                    controller.setCurrentCard(controller.cards().getDiscardPile().peek());
                    for(int i = 0; i < 2; i++) {
                        autoDraw();
                    }
                    if(controller.getCurrentPlayer().getCards().isEmpty()) {
                        txtField.setText("Game Over. You Win!");
                        setEndGame(true);
                    }
                    controller.setCurrentPlayer(controller.getAutoPlayer());
            } else if(controller.match(controller.getRealPlayer().getCards().get(index))) {
                   controller.cards().getDiscardPile().push(controller.getRealPlayer().getCards().get(index));
                   playerDiscard(index);
                   controller.setCurrentCard(controller.cards().getDiscardPile().peek());
                   if(controller.getCurrentPlayer().getCards().isEmpty()) {
                        txtField.setText("Game Over. You Win!");
                        setEndGame(true);
                    }
                    controller.setCurrentPlayer(controller.getAutoPlayer());
                }
            }
        }
    }
    
    private void autoHandle() {
        if(gameOver == false) {
            if(controller.getCurrentPlayer().getCards().isEmpty()) {
                txtField.setText("The Computer Wins!");
                txtField.setStyle("-fx-text-fill: red; -fx-font-size: 16px;");
                setEndGame(true);
            }
            if(controller.cards().getDrawPile().isEmpty()) {
                newShuffle();
            }
            String[] color = {"red", "green", "yellow", "blue"};
            String autoChoice = "";
            for(int i = 0; i < controller.getAutoPlayer().getCards().size(); i++) {
                UnoCard autoCard = controller.getAutoPlayer().getCards().get(i);
            if(controller.match((controller.getAutoPlayer().getCards().get(i))) == false) {
                continue;
            }
            if(autoCard.getName().substring(autoCard.getName().length()-9, autoCard.getName().length()-2).equals("plustwo") &&
                    controller.match(controller.getAutoPlayer().getCards().get(i))) {
            }
            else if(controller.match(controller.getAutoPlayer().getCards().get(i)) == true &&
                    !(autoCard.getNumber().equals("-1"))) {
                autoDiscard(i);
                controller.setCurrentCard((controller.cards().getDiscardPile().peek()));
                if(controller.getCurrentPlayer().getCards().isEmpty()) {
                  txtField.setText("The Computer Wins!");
                    txtField.setStyle("-fx-text-fill: red; -fx-font-size: 16px;"); 
                    setEndGame(true);  
                }
                controller.setCurrentPlayer((controller.getRealPlayer()));
                return;
            }
            else if(controller.getAutoPlayer().getCards().get(i).getName().equals("WildPlusFour1")) {
                autoChoice = color[(int) (Math.random() * (color.length))];
                autoDiscard(i);
                controller.cards().getDiscardPile().peek().setColor(autoChoice);
                controller.setCurrentCard(controller.cards().getDiscardPile().peek());
                if(controller.getCurrentPlayer().getCards().isEmpty()) {
                    txtField.setText("The Computer Wins!");
                    txtField.setStyle("-fx-text-fill: red; -fx-font-size: 16px;"); 
                    setEndGame(true);
                }
                for(int j = 0; j < 4; j++) {
                playerDraw();
                }
                txtField.setText("The color is now " + autoChoice);
                txtField.setStyle("-fx-text-fill: red; -fx-font-size: 16px;");
                controller.setCurrentPlayer(controller.getRealPlayer());
                return;
            }
            else if(controller.getAutoPlayer().getCards().get(i).getName().equals("Wild1")) {
                autoChoice = color[(int) (Math.random() * (color.length))];
                txtField.setText("The color is now " + autoChoice);
                txtField.setStyle("-fx-text-fill: red; -fx-font-size: 16px;");
                autoDiscard(i);
                
                controller.cards().getDiscardPile().peek().setColor(autoChoice);
                controller.setCurrentCard(controller.cards().getDiscardPile().peek());
                if(controller.getCurrentPlayer().getCards().isEmpty()) {
                    txtField.setText("The Computer Wins!");
                    txtField.setStyle("-fx-text-fill: red; -fx-font-size: 16px;"); 
                    setEndGame(true);
                }
                controller.setCurrentPlayer(controller.getRealPlayer());
                return;
            }
            }
            autoDraw();
        }
    }
    
    private void setEndGame(boolean b) {
        if (b == true) {
            gameOver = true;
        } else if (b == false) {
            gameOver = false;
        }
    }
    //make discard functions DONE
    public void playerDiscard(int n) {
        controller.cards().getDiscardPile().push(controller.getRealPlayer().remove(controller.getRealPlayer().getCards().get(n)));
        discardPile.getChildren().add(realPlayerHBox.getChildren().remove(n));
    }
    
    public void autoDiscard(int n) {
        if(controller.match(controller.getAutoPlayer().getCards().get(n))) {
            ImageView brief = new ImageView(controller.getAutoPlayer().getCards().get(n).getCardFace());
            controller.cards().getDiscardPile().push(controller.getAutoPlayer().getCards().remove(n));
            autoHBox.getChildren().remove(n);
            discardPile.getChildren().add(brief);
        }
    }
    
    public void visibleButton(boolean b) {
        if ( b == true) {
            txtField.setStyle(txtField.getStyle() + "visibility: visible");
            drawPile.setStyle(drawPile.getStyle() + "visibility: visible");
            discardPile.setStyle(discardPile.getStyle() + "visibility: visible");
            realPlayerHBox.setStyle(realPlayerHBox.getStyle() + "visibility: visible");
            autoHBox.setStyle(autoHBox.getStyle() + "visibility: visible");
            drawButton.setStyle(drawButton.getStyle() + "visibility: visible");
            logo.setStyle("visibility: visible");
        } else if (b == false) {
            txtField.setStyle("visibility: hidden");
            drawPile.setStyle("visibility: hidden");
            discardPile.setStyle("visibility: hidden");
            realPlayerHBox.setStyle("visibility: hidden");
            autoHBox.setStyle("visibility: hidden");
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
        realPlayerHBox.getChildren().add(brief);
        txtField.setText("\nHere's your card! Computer now auto-drawing card...");
        txtField.setStyle("-fx-text-fill: blue; -fx-font-size: 16px;");
        controller.setCurrentPlayer(controller.getAutoPlayer());
    }
    
    public void autoDraw() {
        ImageView brief = new ImageView(controller.cards().getDrawPile().peek().getCardBack());
        drawPile.getChildren().remove(drawPile.getChildren().size()-1);
        controller.getAutoPlayer().draw(controller.cards().getDrawPile().pop());
        autoHBox.getChildren().add(brief);
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
    private void handleStartButton() {
        visibleButton(true);
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
    private void drawClicked() {
        if(controller.getCurrentPlayer() == controller.getRealPlayer()) {
            playerDraw();
            controller.setCurrentPlayer(controller.getAutoPlayer());
        } 
    }
    
    @FXML
    private void mouseMoved() {
        if(wildCard == false) {
            if(controller.getCurrentPlayer() == controller.getAutoPlayer()) {
                autoHandle();
            }
        }
    }
    
    @FXML
    private void redClicked() {
        controller.getCurrentCard().setColor("red");
	wildCard = false;
	visibleCard(false);
	txtField.setText("\nThe color is now red");
        txtField.setStyle("-fx-text-fill: red; -fx-font-size: 16px;");
    }

    @FXML
    private void greenClicked() {
        controller.getCurrentCard().setColor("green");
	wildCard = false;
	visibleCard(false);
	txtField.setText("\nThe color is now green");
        txtField.setStyle("-fx-text-fill: red; -fx-font-size: 16px;");
    }

    @FXML
    private void yellowClicked() {
         controller.getCurrentCard().setColor("yellow");
	wildCard = false;
	visibleCard(false);
	txtField.setText("\nThe color is now yellow");
        txtField.setStyle("-fx-text-fill: red; -fx-font-size: 16px;");
    }

    @FXML
    private void blueClicked() {
       controller.getCurrentCard().setColor("blue");
	wildCard = false;
	visibleCard(false);
	txtField.setText("\nThe color is now blue");
        txtField.setStyle("-fx-text-fill: red; -fx-font-size: 16px;");
    }

    @FXML
    private void select() {
        if(wildCard == false) {
            ArrayList<ImageView> arr = new ArrayList<ImageView>();
            for(int i = 0; i < realPlayerHBox.getChildren().size(); i++) {
                arr.add((ImageView) realPlayerHBox.getChildren().get(i));
            }
            for(int i = 0; i < realPlayerHBox.getChildren().size(); i++) {
                arr.get(i).setOnMouseClicked(this::playerHandle);
            }
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO
    }  
    
}