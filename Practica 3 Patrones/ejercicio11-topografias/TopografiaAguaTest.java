package ar.edu.unlp.objetos.oo2.ejercicio11_topografias;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaAguaTest {
	private Topografia agua1,agua2,tierra;
	
	
	@BeforeEach
	void setUp() {
		tierra = new Tierra();
		agua1 = new Agua();
		agua2 = new Agua();
	}
	
	@Test
	void testProporcionesAgua() {
		assertEquals(1,agua1.proporcionAgua());
		assertNotEquals(0,agua2.proporcionAgua());
	}
	@Test
	void testProporcionesTierra() {
		assertEquals(0,agua1.proporcionTierra());
		assertNotEquals(1,agua2.proporcionTierra());
	}
	
	@Test
	void testIgualdad() {
		assertTrue(agua1.igual(agua2));
		assertTrue(agua2.igual(agua1));
		assertFalse(agua1.igual(tierra));
	}

}
