/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment1.itdazzlers;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0665769
 */
public class CPD4414Assignment1ITDazzlersTest {
    
    public CPD4414Assignment1ITDazzlersTest() {
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
     * Test of main method, of class CPD4414Assignment1ITDazzlers.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CPD4414Assignment1ITDazzlers.main(args);
        
    }

    /**
     * Test of stringPower method, of class CPD4414Assignment1ITDazzlers.
     */
    @Test
    public void testStringPower() {
        System.out.println("stringPower");
        String str = "";
        int n = 1;
        String expResult = "";
        String result = CPD4414Assignment1ITDazzlers.stringPower(str, n);
        assertEquals(expResult, result);
        
    }
    
    public void testEmptyStringShouldReturnEmptyString(){
        System.out.println("EmptyStringShouldReturnEmptyString");
        String str = "";
        int n = 1;
        String expResult = "";
        String result = CPD4414Assignment1ITDazzlers.stringPower(str, n);
        assertEquals(expResult, result);
    } 
    
    public void testLessThanOneShouldReturnNull(){
        
        System.out.println("LessThanOneShouldReturnNull");
        String str = "";
        int n = -8;
        String expResult = null;
        String result = CPD4414Assignment1ITDazzlers.stringPower(str, n);
        assertEquals(expResult, result);
        
        
    } 
    
    public void testStringAndOneShouldReturnString(){
        System.out.println("testStringAndOneShouldReturnString");
        String str = "Hello";
        int n = 1;
        String expResult = "Hello";
        String result = CPD4414Assignment1ITDazzlers.stringPower(str, n);
        assertEquals(expResult, result);
    }
    
    public void testStringAndTwoShouldReturnStringDoubled(){
        System.out.println("testStringAndTwoShouldReturnStringDoubled");
        String str = "bob";
        int n = 2;
        String expResult = "bobbob";
        String result = CPD4414Assignment1ITDazzlers.stringPower(str, n);
        assertEquals(expResult, result);
    }
    
}
