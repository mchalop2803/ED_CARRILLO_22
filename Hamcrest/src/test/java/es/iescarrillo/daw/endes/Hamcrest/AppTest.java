package es.iescarrillo.daw.endes.Hamcrest;

import static org.junit.Assert.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.isA;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void devolver()
    {
        assertThat("serie", true);
    }
    
    @Test
    public void devolver1()
    {
    	assertThat("videojuego", false);
    }
    
    @Test
    public void devolver2()
    {
    	assertThat("serie", false);
    }
    
    @Test
    public void devolver3()
    {
    	assertThat("videojuego", true);
    }
    
    @Test
    public void entregar()
    {
    	assertThat("serie", false);
    }
    
    @Test
    public void entregar1()
    {
    	assertThat("serie", true);
    }
    
    @Test
    public void entregar2()
    {
    	assertThat("videojuego", false);
    }
    
    @Test
    public void entregar3()
    {
    	assertThat("videojuego", true);
    }
    
    @Test
    public void esEntregado()
    {
    	assertThat("serie", true);
    }
    
    @Test
    public void esEntregado1()
    {
    	assertThat("videojuego", true);
    }
}
