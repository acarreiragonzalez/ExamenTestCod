/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mcdbateria;

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
    
    private int numero1;
    private int numero2;
  
    private  String mensajeResultado = "";
    private Calculo conecta;
    
   
    
    @Before
    public void initialize(){
    } 

    public CalculoTest(int numero1, int numero2, String mensajeResultado) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.mensajeResultado=mensajeResultado;
      
    }
    
  @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
            {2, 2},
            {4, 8},
            {2, 4},
            {10, 20}
        });
    }

    @Test
    public void testMain() {
        System.out.println("Parameterized Number is : " + numero1 + " " + numero2 + " ---> " + mensajeResultado);
        assertEquals(mensajeResultado,
             conecta.obtenerMCD(numero1,numero2),0.0);
    }

}
