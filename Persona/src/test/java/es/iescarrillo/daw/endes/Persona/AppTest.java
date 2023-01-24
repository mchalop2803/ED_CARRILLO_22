package es.iescarrillo.daw.endes.Persona;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    Persona p1 = new Persona("Manuel", 19, 'H', 75, 1.75);
    Persona p2 = new Persona("Laura", 17, 'M', 50, 1.65);
   
    @Test
    public void testMayordeEdad()
    {
        assertTrue(p1.esMayorDeEdad());
    }
    
    @Test
    
    public void testMayordeEdad1() {
    	assertFalse(p2.esMayorDeEdad());
    }
    
    @Test
    
    public void testCalcularIMC() {
    	assertEquals(1, p1.calcularIMC());
    }
    
    @Test
    
    public void testCalcularIMC1() {
    	assertEquals(-1, p1.calcularIMC());
    }
    
	@Test
	    
	    public void testCalcularIMC2() {
	    	assertEquals(-1, p2.calcularIMC());
	    }
	
	@Test
	
	public void testCalcularIMC3() {
		assertEquals(1, p2.calcularIMC());
	}
}
