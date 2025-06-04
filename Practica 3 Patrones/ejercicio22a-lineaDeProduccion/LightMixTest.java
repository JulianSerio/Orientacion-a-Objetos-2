package ar.edu.unlp.objetos.oo2.ejercicio22_lineaDeProduccion;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LightMixTest {
	private LightMix mix;
	private MixingTankStub mx;
	
	@BeforeEach
	void setUp() {
		mix = new LightMix();
		mx = new MixingTankStub();
	}

	@Test
	void testBasicoExecute() {
		assertTrue(mix.basicExecute(mx));
		assertNotEquals(false,mix.basicExecute(mx));
	}
	
	@Test
	void testExecute() {
		mix.execute(mx);
		assertTrue(mix.isDone());
		assertNotEquals(false,mix.isDone());
	}

}
