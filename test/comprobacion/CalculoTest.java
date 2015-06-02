/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package comprobacion;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author oracle
 */
public class CalculoTest {

    public CalculoTest() {
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
     * Test of testSetNum1 method, of class Calculo.
     */
    @Test
    public void testMensajeria() {
        int num1 = -1;
        int num2 = 7;
        Calculo instance = new Calculo();
        String expResult = "Números negativos incorrectos";
        String result = instance.comprobarErros(num1, num2);
        assertEquals(expResult, result);
        System.out.println("Datos correctos");
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerMCD method, of class Calculo.
     */
@Test
    public void testObtenerMCD() {
        System.out.println("obtenerMCD");
        int num1 = 2;
        int num2 = 2;
        mcd.Calculo instance = new mcd.Calculo();
        int expResult = 2;
        int result = instance.obtenerMCD(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}