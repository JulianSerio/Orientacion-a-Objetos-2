package ar.edu.unlp.objetos.oo2.ejercicio11_topografias;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaPantanoTest {
private Topografia pan1,pan2,tierra;
	
	@BeforeEach
	void setUp() {
		tierra = new Tierra();
		pan1 = new Pantano();
		pan2 = new Pantano();
	}
	
	@Test
	void testProporcionesAgua() {
		assertEquals(0.7,pan1.proporcionAgua());
		assertNotEquals(0.3,pan1.proporcionAgua());
	}
	@Test
	void testProporcionesTierra() {
		assertEquals(0.3,pan1.proporcionTierra());
		assertNotEquals(0.7,pan1.proporcionTierra());
	}
	
	@Test
	void testIgualdad() {
		assertTrue(pan1.igual(pan2));
		assertTrue(pan2.igual(pan1));
		assertFalse(pan1.igual(tierra));
	}
}
