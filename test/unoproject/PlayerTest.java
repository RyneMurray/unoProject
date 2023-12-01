/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package unoproject;

import java.util.ArrayList;
import javafx.scene.image.ImageView;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author murra
 */
public class PlayerTest {
    
    public PlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of draw method, of class Player.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        UnoCard cardDrawn = null;
        Player instance = null;
        instance.draw(cardDrawn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCards method, of class Player.
     */
    @Test
    public void testGetCards() {
        System.out.println("getCards");
        Player instance = null;
        ArrayList<UnoCard> expResult = null;
        ArrayList<UnoCard> result = instance.getCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardFace method, of class Player.
     */
    @Test
    public void testGetCardFace() {
        System.out.println("getCardFace");
        Player instance = null;
        ArrayList<ImageView> expResult = null;
        ArrayList<ImageView> result = instance.getCardFace();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Player.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        UnoCard removeCard = null;
        Player instance = null;
        UnoCard expResult = null;
        UnoCard result = instance.remove(removeCard);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
