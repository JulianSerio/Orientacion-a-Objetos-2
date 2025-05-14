package ar.edu.unlp.objetos.oo2.ejercicio11_topografias;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTierraTest {
private Topografia tierra1,tierra2,agua;
	
	@BeforeEach
	void setUp() {
		agua = new Agua();
		tierra1 = new Tierra();
		tierra2 = new Tierra();
	}
	
	@Test
	void testProporcionesAgua() {
		assertEquals(0,tierra1.proporcionAgua());
		assertNotEquals(1,tierra1.proporcionAgua());
	}
	@Test
	void testProporcionesTierra() {
		assertEquals(1,tierra1.proporcionTierra());
		assertNotEquals(0,tierra1.proporcionTierra());
	}
	
	@Test
	void testIgualdad() {
		assertTrue(tierra1.igual(tierra2));
		assertTrue(tierra2.igual(tierra1));
		assertFalse(tierra1.igual(agua));
	}


}
