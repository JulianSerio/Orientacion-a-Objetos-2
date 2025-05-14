package ar.edu.unlp.objetos.oo2.ejercicio11_topografias;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaMixtaTest {
private Topografia mixtaDistinta,mixta1,mixta2;
	
	@BeforeEach
	void setUp() {
		mixta1 = new Mixta(new Agua(),new Agua(),new Tierra(),new Tierra()); 
		mixta2 = new Mixta(new Agua(),new Agua(),new Tierra(),new Tierra());
		mixtaDistinta = new Mixta(new Agua(),new Tierra(),new Tierra(),new Mixta(new Agua(),new Agua(),new Tierra(),new Tierra()));
	}
	
	@Test
	void testProporciones() {
		double proporcion = 0.5;
		assertEquals(proporcion,mixta1.proporcionAgua());
		assertEquals(proporcion,mixta1.proporcionTierra());
		
		//proporcionAgua = 1 + 0 + 0 + ((1+1+0+0) / 4) / 4 = 0.375
		//proporcionTierra = 0 + 1 + 1 + ((0+0+1+1) / 4) / 4 = 0.625
		double propAgua = 0.375;
		double propTierra = 0.625;
		
		assertEquals(propAgua,mixtaDistinta.proporcionAgua());
		assertEquals(propTierra,mixtaDistinta.proporcionTierra());
	}
	@Test
	void testIgualdad() {
		assertTrue(mixta1.igual(mixta2));
		assertTrue(mixta2.igual(mixta1));
		assertFalse(mixta1.igual(mixtaDistinta));
	}
}

