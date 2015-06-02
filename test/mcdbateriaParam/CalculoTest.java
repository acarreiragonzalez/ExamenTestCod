/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mcdbateriaParam;

import mcdbateriaParam.Calculo;
import java.util.Arrays;
import java.util.Collection;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author oracle
 */
@RunWith(Parameterized.class)
public class CalculoTest {

    private int result;
    Calculo cal = new Calculo();

    @Before
    public void initialize() {

    }

    public CalculoTest(Calculo cal, int result) {
        this.cal = cal;
        this.result = result;

    }

    @Parameterized.Parameters
    public static Collection MCDnumeros() {
        return Arrays.asList(new Object[][]{
            {new Calculo(2, 4), 2},
            {new Calculo(2, -7), 1},
            {new Calculo(2, 2), 2},
            {new Calculo(2, -2), 3}

        });
    }

    @Test
    public void testMCDnumbersChecker() {
        System.out.println("Parameterized MCD is : " + result);
        assertEquals(result, cal.obtenerMCD(cal.getNumero1(), cal.getNumero2()));
    }
}