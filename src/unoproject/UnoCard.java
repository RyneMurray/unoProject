/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unoproject;

import javafx.scene.image.Image;

/**
 *
 * @author murra
 */
public final class UnoCard {
    private String number;
    private String action;
    public String color;
    public Image cardFace;
    public Image cardBack;
    public boolean faceDown = false;
    private String name;

    public UnoCard(String number, String action, String color) {
        this.number = number;
        this.action = action;
        this.color = color;
        
        this.name = this.color + this.action + this.number;
        
        setCardFace();
    }
    
    public void setCardFace() {
        String path = "/unoimages/" + name + ".png";
        String backSidePath = "/otherimages/UNO-Back.png";
        this.cardFace = new Image(path, 175, 175, true, true);
        this.cardBack = new Image(backSidePath, 175, 175, true, true);
    }   
    
    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
    
    public String getColor() {
        return color;
    }

    public String getAction() {
        return action;
    }

    public Image getCardFace() {
        return cardFace;
    }

    public Image getCardBack() {
        return cardBack;
    }

    @Override
    public String toString() {
        return this.name;
    }

    
    public void setColor(String color) {
        this.color = color;
    }

    public void setFaceDown(boolean s) {
        this.faceDown = s;
    }
            
}
