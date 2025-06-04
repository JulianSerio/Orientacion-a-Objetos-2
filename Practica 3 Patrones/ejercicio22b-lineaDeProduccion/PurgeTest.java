package ar.edu.unlp.objetos.oo2.ejercicio22_lineaDeProduccion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PurgeTest {
	private Purge purge;
	private MixingTankSpy spy;
	
	@BeforeEach
	void setUp() {
		purge = new Purge();
		spy = new MixingTankSpy();
	}
	
	@Test
	void testBasicoExecute() {
		boolean result = purge.basicExecute(spy);
		
		assertTrue(spy.heatPowerCalled);
		assertEquals(0,spy.heatPowerValue);
		
		assertTrue(spy.mixerPowerCalled);
		assertEquals(0,spy.mixerPowerValue);
		
	    assertTrue(spy.purgeCalled);
		assertTrue(result);
	}
	
	@Test
	void testExecute() {
		purge.execute(spy);
		assertTrue(purge.isDone());
		assertNotEquals(false,purge.isDone());
	}

}
