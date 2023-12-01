/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package unoproject;

import java.util.Stack;
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
public class VisualCardTest {
    
    public VisualCardTest() {
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
     * Test of getDrawPileImage method, of class VisualCard.
     */
    @Test
    public void testGetDrawPileImage() {
        System.out.println("getDrawPileImage");
        VisualCard instance = new VisualCard();
        Stack<ImageView> expResult = null;
        Stack<ImageView> result = instance.getDrawPileImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDrawPileImage method, of class VisualCard.
     */
    @Test
    public void testSetDrawPileImage() {
        System.out.println("setDrawPileImage");
        Stack<ImageView> drawPileImage = null;
        VisualCard instance = new VisualCard();
        instance.setDrawPileImage(drawPileImage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiscardPileImage method, of class VisualCard.
     */
    @Test
    public void testGetDiscardPileImage() {
        System.out.println("getDiscardPileImage");
        VisualCard instance = new VisualCard();
        Stack<ImageView> expResult = null;
        Stack<ImageView> result = instance.getDiscardPileImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDiscardPileImage method, of class VisualCard.
     */
    @Test
    public void testSetDiscardPileImage() {
        System.out.println("setDiscardPileImage");
        Stack<ImageView> discardPileImage = null;
        VisualCard instance = new VisualCard();
        instance.setDiscardPileImage(discardPileImage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDrawPile method, of class VisualCard.
     */
    @Test
    public void testGetDrawPile() {
        System.out.println("getDrawPile");
        VisualCard instance = new VisualCard();
        Stack<UnoCard> expResult = null;
        Stack<UnoCard> result = instance.getDrawPile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiscardPile method, of class VisualCard.
     */
    @Test
    public void testGetDiscardPile() {
        System.out.println("getDiscardPile");
        VisualCard instance = new VisualCard();
        Stack<UnoCard> expResult = null;
        Stack<UnoCard> result = instance.getDiscardPile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDrawPileFaceDown method, of class VisualCard.
     */
    @Test
    public void testSetDrawPileFaceDown() {
        System.out.println("setDrawPileFaceDown");
        VisualCard instance = new VisualCard();
        instance.setDrawPileFaceDown();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shuffleDrawPile method, of class VisualCard.
     */
    @Test
    public void testShuffleDrawPile() {
        System.out.println("shuffleDrawPile");
        VisualCard instance = new VisualCard();
        instance.shuffleDrawPile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class VisualCard.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        VisualCard instance = new VisualCard();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
