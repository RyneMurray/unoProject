/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package unoproject;

import java.net.URL;
import java.util.ResourceBundle;
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
public class FXMLDocumentControllerTest {
    
    public FXMLDocumentControllerTest() {
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
     * Test of playerDiscard method, of class FXMLDocumentController.
     */
    @Test
    public void testPlayerDiscard() {
        System.out.println("playerDiscard");
        int n = 0;
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.playerDiscard(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of autoDiscard method, of class FXMLDocumentController.
     */
    @Test
    public void testAutoDiscard() {
        System.out.println("autoDiscard");
        int n = 0;
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.autoDiscard(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visibleButton method, of class FXMLDocumentController.
     */
    @Test
    public void testVisibleButton() {
        System.out.println("visibleButton");
        boolean b = false;
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.visibleButton(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newShuffle method, of class FXMLDocumentController.
     */
    @Test
    public void testNewShuffle() {
        System.out.println("newShuffle");
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.newShuffle();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playerDraw method, of class FXMLDocumentController.
     */
    @Test
    public void testPlayerDraw() {
        System.out.println("playerDraw");
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.playerDraw();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of autoDraw method, of class FXMLDocumentController.
     */
    @Test
    public void testAutoDraw() {
        System.out.println("autoDraw");
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.autoDraw();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dealCards method, of class FXMLDocumentController.
     */
    @Test
    public void testDealCards() {
        System.out.println("dealCards");
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.dealCards();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visibleCard method, of class FXMLDocumentController.
     */
    @Test
    public void testVisibleCard() {
        System.out.println("visibleCard");
        boolean b = false;
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.visibleCard(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardStyle method, of class FXMLDocumentController.
     */
    @Test
    public void testGetCardStyle() {
        System.out.println("getCardStyle");
        String color = "";
        FXMLDocumentController instance = new FXMLDocumentController();
        String expResult = "";
        String result = instance.getCardStyle(color);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initialize method, of class FXMLDocumentController.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        URL location = null;
        ResourceBundle resources = null;
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.initialize(location, resources);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
