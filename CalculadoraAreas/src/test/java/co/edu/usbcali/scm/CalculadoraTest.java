package co.edu.usbcali.scm;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testAreaTriangulo() {
		ICalculadoraAreas c = new CalculadoraAreas();
		c.areaTriangulo(4, 8);
		assertTrue("Area del Triangulo ", c.getResultado()>0);
		
	}

	@Test
	public void testAreaCirculo() {
		ICalculadoraAreas c = new CalculadoraAreas();
		c.areaCirculo(4);
		assertTrue("Area del Circulo ", c.getResultado()>0);
		
	}
	
	@Test
	public void testAreaCuadrado() {
		ICalculadoraAreas c = new CalculadoraAreas();
		c.areaCuadrado(4);
		assertTrue("Area del Cuadrado ", c.getResultado()>0);
		
	}
	@Test
	public void testAreaRectangulo() {
		ICalculadoraAreas c = new CalculadoraAreas();
		c.areaRectangulo(4,2);
		assertTrue("Area del Rectangulo ", c.getResultado()>0);
		
	}
}
