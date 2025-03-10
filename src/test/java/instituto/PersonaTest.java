/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package instituto;

import java.time.LocalDate;
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
public class PersonaTest {

    public PersonaTest() {
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
     * Test of getNif method, of class Persona.
     */
    @Test
    public void testGetNif() {
        Persona persona = new Persona(12345678);

        assertEquals("12345678-Z", persona.getNif().toString());
    }

    /**
     * Test of setNif method, of class Persona.
     */
    @Test
    public void testSetNif() {
        Persona persona = new Persona();
        Nif nuevoNif = new Nif(12345678);
        persona.setNif(nuevoNif);

        assertEquals("12345678-Z", persona.getNif().toString());
    }

    /**
     * Test of getNombre method, of class Persona.
     */
    @Test
    public void testGetNombre() {
        Persona persona = new Persona(12345678, "Juan", 'H', 1, 1, 2000);

        assertEquals("Juan", persona.getNombre());
    }

    /**
     * Test of setNombre method, of class Persona.
     */
    @Test
    public void testSetNombre() {
        Persona persona = new Persona();
        persona.setNombre("Ana");

        assertEquals("Ana", persona.getNombre());
    }

    /**
     * Test of getGenero method, of class Persona.
     */
    @Test
    public void testGetGenero() {
        Persona persona = new Persona(12345678, "Juan", 'H', 1, 1, 2000);

        assertEquals('H', persona.getGenero());
    }

    /**
     * Test of setGenero method, of class Persona.
     */
    @Test
    public void testSetGenero() {
        Persona persona = new Persona();
        persona.setGenero('M');

        assertEquals('M', persona.getGenero());
    }

    /**
     * Test of getNacimiento method, of class Persona.
     */
    @Test
    public void testGetNacimiento() {
        LocalDate fechaNacimiento = LocalDate.of(2000, 1, 1);
        Persona persona = new Persona(12345678, "Juan", 'H', 1, 1, 2000);

        assertEquals(fechaNacimiento, persona.getNacimiento());
    }

    /**
     * Test of setNacimiento method, of class Persona.
     */
    @Test
    public void testSetNacimiento() {
        Persona persona = new Persona();
        LocalDate nuevaFecha = LocalDate.of(1995, 5, 15);
        persona.setNacimiento(nuevaFecha);

        assertEquals(nuevaFecha, persona.getNacimiento());
    }

    /**
     * Test of getEdad method, of class Persona.
     */
    @Test
    public void testGetEdad() {
        LocalDate fechaNacimiento = LocalDate.of(2000, 1, 1);
        Persona persona = new Persona(12345678, "Juan", 'H', 1, 1, 2000);

        int edadEsperada = LocalDate.now().getYear() - fechaNacimiento.getYear();

        assertEquals(edadEsperada, persona.getEdad());
    }

    /**
     * Test of toString method, of class Persona.
     */
    @Test
    public void testToString() {
        Persona persona = new Persona(12345678, "Juan Perez", 'H', 1, 1, 2000);

        String expected = "12345678-Z\tJuan\tPerez\t\t" + persona.getEdad();
        assertEquals(expected, persona.toString());
    }

    /**
     * Test of equals method, of class Persona.
     */
    @Test
    public void testEquals_Persona() {
        Persona persona1 = new Persona(12345678, "Juan", 'H', 1, 1, 2000);
        Persona persona2 = new Persona(12345678, "Ana", 'M', 2, 2, 1995);

        assertTrue(persona1.equals(persona2));

        Persona persona3 = new Persona(87654321, "Carlos", 'H', 3, 3, 1990);

        assertFalse(persona1.equals(persona3));
    }

    /**
     * Test of compareTo method, of class Persona.
     */
    @Test
    public void testCompareTo() {

        Persona persona1 = new Persona(12345678, "Juan", 'H', 1, 1, 2000);
        Persona persona2 = new Persona(87654321, "Ana", 'M', 2, 2, 1995);

        assertTrue(persona1.compareTo(persona2) < 0);

        assertTrue(persona2.compareTo(persona1) > 0);

        Persona persona3 = new Persona(12345678, "Carlos", 'H', 3, 3, 1990);

        assertEquals(0, persona1.compareTo(persona3));
    }

}
