package es.iescarrillo.daw.endes.Cuenta_Tarjeta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Date;

import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    Cuenta c1 = new Cuenta("ES49724562539", "Noel");
    Cuenta c2 = new Cuenta("PT90812673915", "Anna");
    Movimiento m1 = new Movimiento();
    Credito ct1 = new Credito("459281765", "Juan", new Date() ,50.00);
    
    
    @Test
    public void testIngresarCantidad() throws Exception
    {
        c1.ingresar(1000);
        c1.getSaldo();
    }
    
    @Test
    public void testRetirarCantidad() throws Exception {
    	Cuenta c1 = new Cuenta("PT93152322413", "Paulo");
    	c1.ingresar(1000);
    	c1.retirar(500);
    	c1.getSaldo();
    }
    
    @Test
    public void testIngresarConcepto() throws Exception{
    	c1.ingresar("pago luz", 150);
    	c1.getSaldo();
    }
    
    @Test
    public void testIngresarConcepto1() throws Exception{
    	c2.ingresar("pago luz", 150);
    	c2.getSaldo();
    }
    
    @Test
    public void testRetirarConcepto() throws Exception{
    	Cuenta c1 = new Cuenta("US9592156740", "Antonio");
    	c1.ingresar(200);
    	c1.retirar("comprar ropa", 50);
    }
    
    @Test
    public void testRetirarConcepto1() throws Exception{
    	Cuenta c1 = new Cuenta("ES48591723051", "Mauro");
    	c1.ingresar(150);
    	c1.retirar("poner gasolina", 200);
    }
    
    @Test
    public void testAñadirMovimiento() throws Exception{
    	c1.addMovimiento(m1);
    	
    }
    
    @Test
    public void testAñadirImporte() throws Exception{
    	c1.ingresar(500);
    	m1.setImporte(c1.getSaldo());
    }
    
    @Test
    public void testConceptoImporte() throws Exception{
    	c1.ingresar("ropa", 50);
    	m1.setConcepto("ropa");
    	m1.setImporte(c1.getSaldo());
    }
    
    @Test
    public void testAñadirFecha() throws Exception{
    	String Date1 = "20-02-2023";
    	Date fecha = (Date) new SimpleDateFormat("dd-mm-yyyy").parse(Date1);
    	m1.setFecha(fecha);
    }
    @Test
    public void testIngresarCred() throws Exception{
    	Movimiento m1 = new Movimiento();
    	
    	ct1.ingresar(500);
    	m1.setImporte(ct1.getSaldo());
    	assertEquals(m1.getImporte(), ct1.getSaldo());
    }
    
    @Test
    public void testPagoEstablecimiento() throws Exception{
    	Credito ct1 = new Credito("625179348", "Laura", new Date() ,50.00);
    	ct1.pagoEnEstablecimiento("tienda de ropa", 40);
    }
    
    @Test
    public void testRetirar() throws Exception{
    	Cuenta c1 = new Cuenta("PT9315267912", "Pedro");
    	c1.ingresar(500);
    	c1.retirar("luz", -100);
    	c1.retirar(600);
    }
    
    @Test
    public void testIngresar() throws Exception{
    	Cuenta c1 = new Cuenta("PT1356212318", "Marcos");
    	Cuenta c2 = new Cuenta("ES1341531242", "Luna");
    	c1.ingresar(-100);
    	c2.ingresar("guardo", -500);
    }
    
    @Test
    public void testRetirarNegativo() throws Exception{
    	Cuenta c1 = new Cuenta("UK9282357231", "Celeste");
    	c1.retirar(-100);
    }
    
    @Test
    public void testIngresarNegativo() throws Exception{
    	Cuenta c1 = new Cuenta("ES9124123215", "Sara");
    	c1.ingresar("nada", -50);
    }
    
    @Test
    public void testRetirarInsuficiente() throws Exception{
    	Cuenta c1 = new Cuenta("PT5183858212", "Rocio");
    	c1.retirar(20);
    }
    
    @Test
    public void testCuentaAsociada() throws Exception{
    	ct1.setCuenta(c1);
    }
}
