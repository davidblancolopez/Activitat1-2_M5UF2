/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import matricula.pkg2.Calcul;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ALUMNEDAM
 */
public class testCalcul {
    
    public testCalcul() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    

    //Test de preu 1 introducimos el numero 3 y nos devolvera 90 del calculo de 3 * 30.
    @Test
    public final void testPreu(){
        
        assertEquals(90, Calcul.calculPreu(3));
    }
    
    //Test de preu 2 introducimos el numero 13 y nos devolvera 380 que es el precio de matricula a partir de 12 o mas UF.
    @Test
    public final void testPreu2(){
        
        assertEquals(380, Calcul.calculPreu(13));
    }
    
    /*
    
    //Test de preu 3 introducimos una letra y nos tendria que mostrar un error
    //indicando que introduzcamos numeros enteros.
    @Test
    public final void testPreu3(){
        
        assertEquals(noEnters, Calcul.calculPreu("a"));
    }
    */
    
    
}
