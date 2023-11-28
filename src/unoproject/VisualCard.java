/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unoproject;

import java.util.Collections;
import java.util.Stack;
import javafx.scene.image.ImageView;

/**
 *
 * @author murra
 */
public class VisualCard {
    private Stack<UnoCard> drawPile;
    private Stack<UnoCard> discardPile;
    private Stack<ImageView> drawPileImage;
    private Stack<ImageView> discardPileImage;
    public Stack<UnoCard> cards = new Stack<>();
    public String[] colors = {"Red", "Yellow", "Green", "Blue", "Wild"};
    
    public VisualCard() {
        int colorIndex = 0;
        int cardIndex = 0;
        
        do {
          if(colorIndex <= 3) {
              for(int c = 0; c < 13; c++) {
              if (c == 0) {
                  cards.add(new UnoCard("0", "Number",colors[colorIndex]));
                  cardIndex++;
              } else if (c>0 && c<10) {
                  cards.add(new UnoCard(Integer.toString(c),"Number",colors[colorIndex]));
                  cardIndex++;
                  cards.add(new UnoCard(Integer.toString(c),"Number",colors[colorIndex]));
                  cardIndex++;
              } else if(c == 10) {
                  cards.add(new UnoCard("-1","Skip",colors[colorIndex]));
                  cardIndex++;
                  cards.add(new UnoCard("-1","Skip",colors[colorIndex]));
                  cardIndex++;
              } else if (c == 11) {
                  cards.add(new UnoCard("-1","PlusTwo",colors[colorIndex]));
                  cardIndex++;
                  cards.add(new UnoCard("-1","PlusTwo",colors[colorIndex]));
                  cardIndex++;
              } else if (c == 12) {
                 cards.add(new UnoCard("-1","Reverse",colors[colorIndex]));
                  cardIndex++;
                  cards.add(new UnoCard("-1","Reverse",colors[colorIndex]));
                  cardIndex++; 
              }
          }
          }
         if(colorIndex > 3) {
             for(int i = 0; i < 4; i++) {
                 cards.add(new UnoCard("-1", "PlusFour", colors[4]));
                 cardIndex++;
             } for(int i = 0; i < 4; i++) {
             cards.add(new UnoCard("-1", "Wild", colors[4]));
             cardIndex++;
         }   
         } colorIndex++;
        } while(cardIndex < 100);
        
        drawPile = cards;
        discardPile = new Stack<>();
        drawPileImage = new Stack<>();
        discardPileImage = new Stack<>();
        Collections.shuffle(drawPile);
    }

    public Stack<ImageView> getDrawPileImage() {
        return drawPileImage;
    }

    public void setDrawPileImage(Stack<ImageView> drawPileImage) {
        this.drawPileImage = drawPileImage;
    }

    public Stack<ImageView> getDiscardPileImage() {
        return discardPileImage;
    }

    public void setDiscardPileImage(Stack<ImageView> discardPileImage) {
        this.discardPileImage = discardPileImage;
    }

    public Stack<UnoCard> getDrawPile() {
        return drawPile;
    }

    public Stack<UnoCard> getDiscardPile() {
        return discardPile;
    }
    
    public void setDrawPileFaceDown() {
		for(int i = 0; i < drawPile.size(); i++) {
			drawPile.get(i).setFaceDown(true);
		}
	}
    public void shuffleDrawPile() {
		if(discardPile.size() > 0) {
			for(int i =0; i< discardPile.size(); i++) {
				drawPile.push(discardPile.pop());
			}
		}
		Collections.shuffle(drawPile);
		setDrawPileFaceDown();
	}

    @Override
    public String toString() {
        String v = "";
        for (int i =0; i < cards.size() - 1; i++) {
            v += cards.get(i) + "\n";
        }
        return v;
    }
    
    
}
