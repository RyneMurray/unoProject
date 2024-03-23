/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * Source: https://github.com/GabrielWeinbrenner/UNO-in-JAVA
 */
package unoproject;

import java.util.ArrayList;
import javafx.scene.image.ImageView;

/**
 *
 * @author murra
 */
public class Player {
    private ArrayList<UnoCard> cards;
    private ArrayList<ImageView> cardFace;
    
    public Player(String name) {
        this.cards = new ArrayList<UnoCard>();
        this.cardFace = new ArrayList<ImageView>();
    }
    
    public void draw (UnoCard cardDrawn) {
        cards.add(cardDrawn);
    }
    
    public ArrayList<UnoCard> getCards() {
        return this.cards;
    }
    
    public ArrayList<ImageView> getCardFace() {
        return this.cardFace;
    }
    
    public UnoCard remove(UnoCard removeCard) {
        for(int i=0; i < cards.size(); i++) {
            if(cards.get(i).equals(removeCard)) {
                return cards.remove(i);
            }
        }
      return cards.get(0);
    }
}
