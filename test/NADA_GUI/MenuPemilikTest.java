/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NADA_GUI;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nurshabah
 */
public class MenuPemilikTest {
    
    public MenuPemilikTest() {
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
     * Test of koneksi method, of class MenuPemilik.
     */
    @Test
    public void testKoneksi() {
        System.out.println("koneksi");
        MenuPemilik instance = new MenuPemilik();
        instance.koneksi();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of tampildatasewa method, of class MenuPemilik.
     */
    @Test
    public void testTampildatasewa() {
        System.out.println("tampildatasewa");
        MenuPemilik instance = new MenuPemilik();
        instance.tampildatasewa();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of main method, of class MenuPemilik.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MenuPemilik.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
