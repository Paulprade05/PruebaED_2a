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
public class CursoTest {

    public CursoTest() {
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
     * Test of getNombre method, of class Curso.
     */
    @Test
    public void testGetNombre() {
        Curso curso = new Curso("Primero");

        assertEquals("Primero", curso.getNombre());
    }

    /**
     * Test of toString method, of class Curso.
     */
    @Test
    public void testToString() {
        Curso curso = new Curso("Primero");
        Persona alumno = new Persona(12345678, "Juan", 'H', 1, 1, 2000);
        curso.aniadirAlumno(alumno);
        String expected = "--------------------Primero-----------------\n"
                + "NumExp\tNIF\t\tNombre\t\tApellidos\n"
                + "-------------------------------------------------\n"
                + "12345678-Z\tJuan\t\t\t25\n";
        assertEquals(expected, curso.toString());
    }

    /**
     * Test of aniadirAlumno method, of class Curso.
     */
    @Test
    public void testAniadirAlumno() {
        Curso curso = new Curso("Primero");
        Persona alumno = new Persona(12345678, "Juan", 'H', 1, 1, 2000);
        curso.aniadirAlumno(alumno);
        assertTrue(curso.toString().contains("Juan"));
    }

}
