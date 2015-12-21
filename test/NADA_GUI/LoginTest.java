/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NADA_GUI;

import NADA_GUI.Login.User;
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
public class LoginTest {

    public LoginTest() {
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
     * Test of koneksi method, of class Login.
     */
    @Test
    public void testKoneksi() {
        System.out.println("koneksi");
        String user = "pemilik";
        String password = "123";
        Login instance = new Login();
        instance.koneksi();
        assertEquals("123",password);
        assertEquals("pemilik",user);
    }

    /**
     * Test of main method, of class Login.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Login.main(args);
    }

}
