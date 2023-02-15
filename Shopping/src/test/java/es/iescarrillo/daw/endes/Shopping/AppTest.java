package es.iescarrillo.daw.endes.Shopping;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.sun.tools.javac.jvm.Items;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
	ShoppingCart c1;
    Product coche = new Product("coche", 25);
    Product carne = new Product("serranito", 4.5);
    Product televisor = new Product("LG", 250);
    Product lechuga = new Product("lechuga", 4.5);
    Product movil = new Product("LG", 500);
    
    @Test
	public void testComprobarVacio() {
		c1 = new ShoppingCart();
		assertEquals(0, c1.getItemCount());
	}
    
    @Test
    public void testElementosCarro() {
    	c1 = new ShoppingCart();
    	c1.addItem(carne);
    	assertEquals(1, c1.getItemCount());
    }
    
    @Test
    public void testBalanceVacio() {
    	c1 = new ShoppingCart();
    	assertEquals(0, c1.getBalance());
    }
    
    @Test
    public void testAddItem1()
    {
    	c1 = new ShoppingCart();
    	c1.addItem(coche);
    }
    
    @Test
    public void testAddItem2() {
    	c1 = new ShoppingCart();
    	c1.addItem(carne);
    }
    
    @Test
    public void testAddItem3() {
    	c1 = new ShoppingCart();
    	c1.addItem(televisor);
    }
    
	@Test
    public void testBalance() {
		c1 = new ShoppingCart();
    	c1.addItem(coche);
    	c1.getBalance();
    }
	
	@Test
	public void testCompararPrecio() {
		c1 = new ShoppingCart();
		c1.addItem(coche);
		c1.addItem(carne);
		assertTrue(coche.getPrice() > carne.getPrice());
	}
	
	@Test
	public void test() {
		int a = getProductCount(c1);
	}
	
	private int getProductCount(ShoppingCart c1) {
		return c1.getItemCount();
	}
	
	@Test
	public void testEliminarProducto() throws ProductNotFoundException {
		c1 = new ShoppingCart();
		c1.addItem(carne);
		c1.getItemCount();
		c1.removeItem(carne);
		c1.getItemCount();
	}
	
	@Test
	public void testCompararTitulo() {
		c1 = new ShoppingCart();
		c1.addItem(carne);
		c1.addItem(televisor);
		assertTrue(carne.getTitle() != televisor.getTitle());
	}
	
	@Test
	public void testIgualPrecio() {
		c1 = new ShoppingCart();
		c1.addItem(carne);
		c1.addItem(lechuga);
		assertTrue(carne.getPrice() == lechuga.getPrice());
	}
	
	@Test
	public void testIgualTitulo() {
		c1 = new ShoppingCart();
		c1.addItem(televisor);
		c1.addItem(movil);
		assertEquals(televisor.getTitle(), movil.getTitle());
	}
	
	@Test
	public void testempty() {
		c1.empty();
	}
	
	@Test
	public void testEliminarConTry() {
		c1 = new ShoppingCart();
		c1.addItem(televisor);
		try {
			c1.removeItem(carne);
			
		}
		catch (ProductNotFoundException e) {
			fail("No se ha encontrado el producto que quería eliminar.");
		}
	}
}