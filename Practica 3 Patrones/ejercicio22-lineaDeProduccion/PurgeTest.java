package ar.edu.unlp.objetos.oo2.ejercicio22_lineaDeProduccion;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PurgeTest {
	private Purge purge;
	private MixingTank mx;
	
	@BeforeEach
	void setUp() {
		purge = new Purge();
		mx = new MixingTank();
	}
	
	@Test
	void testBasicoExecute() {
		assertTrue(purge.basicExecute(mx));
		assertNotEquals(false,purge.basicExecute(mx));
		
	}
	
	@Test
	void testExecute() {
		purge.execute(mx);
		assertTrue(purge.isDone());
		assertNotEquals(false,purge.isDone());
	}

}
