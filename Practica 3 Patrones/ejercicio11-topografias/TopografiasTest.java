package ar.edu.unlp.objetos.oo2.ejercicio11_topografias;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiasTest {
	private Topografia t1,t2,t3,t4,mixta1,mixta2;
	
	@BeforeEach
	void setUp() {
		t1 = new Agua();
		t2 = new Agua();
		t3 = new Tierra();
		t4 = new Tierra();
		mixta1 = new Mixta(t1,t2,t3,t4); 
		mixta2 = new Mixta(t1,t3,t4,mixta1);
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
		
		assertEquals(propAgua,mixta2.proporcionAgua());
		assertEquals(propTierra,mixta2.proporcionTierra());
	}
	@Test
	void testIgualdad() {
		assertTrue(t1.equals(t2));
		assertFalse(t1.equals(t3));
	}

}
