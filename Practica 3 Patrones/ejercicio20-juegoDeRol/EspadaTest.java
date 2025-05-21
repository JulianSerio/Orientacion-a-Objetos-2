package ar.edu.unlp.objetos.oo2.ejercicio20_juegoDeRol;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EspadaTest {
	private Espada espada;
	private Armadura acero,cuero,hierro;
	
	@BeforeEach
	void setUp() {
		espada = new Espada();
		acero = new Acero();
		cuero = new Cuero();
		hierro = new Hierro();
	}
	
	@Test
	void testAcero() {
		assertEquals(3,espada.atacar(acero));
		assertNotEquals(0,espada.atacar(acero));
	}
	
	@Test
	void testHierro() {
		assertEquals(5,espada.atacar(hierro));
		assertNotEquals(0,espada.atacar(hierro));
	}
	
	@Test
	void testCuero() {
		assertEquals(8,espada.atacar(cuero));
		assertNotEquals(0,espada.atacar(cuero));
	}

}
