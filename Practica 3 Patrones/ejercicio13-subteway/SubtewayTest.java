package ar.edu.unlp.objetos.oo2.ejercicio13_subteway;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubtewayTest {
	private Subteway sw;

	@BeforeEach
	void setUp() {
		this.sw = new Subteway();
	}
	
	@Test
	void testClasico() {
		sw.setBuilder(new Clasico());
		Sandwich sand = sw.construir();
		assertEquals(500,sand.getPrecioTotal());
	}
	
	@Test
	void testSinTacc() {
		sw.setBuilder(new SinTacc());
		Sandwich sand = sw.construir();
		assertEquals(618,sand.getPrecioTotal());
	}
	
	@Test
	void testVegano() {
		sw.setBuilder(new Vegano());
		Sandwich sand = sw.construir();
		assertEquals(620,sand.getPrecioTotal());
	}
	
	@Test
	void testVegetariano() {
		sw.setBuilder(new Vegetariano());
		Sandwich sand = sw.construir();
		assertEquals(420,sand.getPrecioTotal());
	}
}
