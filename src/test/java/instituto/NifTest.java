/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package instituto;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vespertino
 */
public class NifTest {
    
    public NifTest() {
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
     * Test of toString method, of class Nif.
     */
    @Test
    public void testToString() {
        Nif nif = new Nif(12345678);
        assertEquals("12345678-Z", nif.toString());
    }

    /**
     * Test of setNif method, of class Nif.
     */
    @Test
    public void testSetNif() {
        Nif nif = new Nif();
        nif.setNif(12345678);
       
        assertEquals("12345678-Z", nif.toString());
    }

    /**
     * Test of equals method, of class Nif.
     */
    @Test
    public void testEquals() {
        Nif nif1 = new Nif(12345678);
        Nif nif2 = new Nif(12345678);
        
        assertTrue(nif1.equals(nif2));
        
        Nif nif3 = new Nif(87654321);
        
        // Verificar que los NIFs no son iguales
        assertFalse(nif1.equals(nif3));
    }
    
}
