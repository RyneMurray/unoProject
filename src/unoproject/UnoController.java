/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unoproject;

/**
 *
 * @author murra
 */
public class UnoController {
    private UnoCard currentCard;
    private VisualCard primaryDeck;
    private Player playerOne;
    private Player playerTwo;
    private Player currentPlayer;
    
    public UnoController() {
        this.playerOne = new Player ("You");
        this.playerTwo = new Player ("They");
        this.primaryDeck = new VisualCard();
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentCard(UnoCard currentCard) {
        this.currentCard = currentCard;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }
    
    public VisualCard cards() {
        return primaryDeck;
    }
    
    public void draw() {
        currentPlayer.draw(primaryDeck.getDrawPile().pop());
    }
    
    public UnoCard getCurrentCard() {
        return currentCard;
    }
    
    public boolean matching(UnoCard c) {
        System.out.println(
	"------------------\n"+
        currentCard.getColor() + " + " + c.getColor() + "=" +
	currentCard.getColor().equals(c.getColor()) 
		);
	
        System.out.println(
	currentCard.getNumber() + " + " + c.getNumber() + "=" +
	currentCard.getNumber().equals(c.getNumber())
		);
		
        System.out.println(c.getName());
	if(currentCard.getNumber().equals(c.getNumber()) || 
           currentCard.getColor().equals(c.getColor()) || 
           currentCard.getName().equals(c.getName())) {
	return true;
	}else {
	return false;
	}
    }
}