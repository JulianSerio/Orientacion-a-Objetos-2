package ar.edu.unlp.objetos.oo2.ejercicio22_lineaDeProduccion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LightMixTest {
	private LightMix mix;
	private MixingTankSpy spy;
	
	@BeforeEach
	void setUp() {
		mix = new LightMix();
		spy = new MixingTankSpy();
	}

	@Test
	void testBasicoExecute() {
		boolean result = mix.basicExecute(spy);

	    assertTrue(spy.heatPowerCalled);
	    assertEquals(100, spy.heatPowerValue);

	    assertTrue(spy.mixerPowerCalled);
	    assertEquals(5, spy.mixerPowerValue);

	    assertTrue(result);
	}
	
	@Test
	void testExecute() {
		mix.execute(spy);
		assertTrue(mix.isDone());
		assertNotEquals(false,mix.isDone());
	}

}
