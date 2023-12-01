/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package unoproject;

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
public class UnoControllerTest {
    
    public UnoControllerTest() {
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
     * Test of getRealPlayer method, of class UnoController.
     */
    @Test
    public void testGetRealPlayer() {
        System.out.println("getRealPlayer");
        UnoController instance = new UnoController();
        Player expResult = null;
        Player result = instance.getRealPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutoPlayer method, of class UnoController.
     */
    @Test
    public void testGetAutoPlayer() {
        System.out.println("getAutoPlayer");
        UnoController instance = new UnoController();
        Player expResult = null;
        Player result = instance.getAutoPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentPlayer method, of class UnoController.
     */
    @Test
    public void testGetCurrentPlayer() {
        System.out.println("getCurrentPlayer");
        UnoController instance = new UnoController();
        Player expResult = null;
        Player result = instance.getCurrentPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentCard method, of class UnoController.
     */
    @Test
    public void testSetCurrentCard() {
        System.out.println("setCurrentCard");
        UnoCard currentCard = null;
        UnoController instance = new UnoController();
        instance.setCurrentCard(currentCard);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentPlayer method, of class UnoController.
     */
    @Test
    public void testSetCurrentPlayer() {
        System.out.println("setCurrentPlayer");
        Player currentPlayer = null;
        UnoController instance = new UnoController();
        instance.setCurrentPlayer(currentPlayer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cards method, of class UnoController.
     */
    @Test
    public void testCards() {
        System.out.println("cards");
        UnoController instance = new UnoController();
        VisualCard expResult = null;
        VisualCard result = instance.cards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class UnoController.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        UnoController instance = new UnoController();
        instance.draw();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentCard method, of class UnoController.
     */
    @Test
    public void testGetCurrentCard() {
        System.out.println("getCurrentCard");
        UnoController instance = new UnoController();
        UnoCard expResult = null;
        UnoCard result = instance.getCurrentCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of match method, of class UnoController.
     */
    @Test
    public void testMatch() {
        System.out.println("match");
        UnoCard c = null;
        UnoController instance = new UnoController();
        boolean expResult = false;
        boolean result = instance.match(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
