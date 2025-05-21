package ar.edu.unlp.objetos.oo2.ejercicio20_juegoDeRol;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BastonTest {
	private Baston baston;
	private Armadura acero,cuero,hierro;
	
	@BeforeEach
	void setUp() {
		baston = new Baston();
		acero = new Acero();
		cuero = new Cuero();
		hierro = new Hierro();
	}
	
	@Test
	void testAcero() {
		assertEquals(1,baston.atacar(acero));
		assertNotEquals(0,baston.atacar(acero));
	}
	
	@Test
	void testHierro() {
		assertEquals(1,baston.atacar(hierro));
		assertNotEquals(0,baston.atacar(hierro));
	}
	
	@Test
	void testCuero() {
		assertEquals(2,baston.atacar(cuero));
		assertNotEquals(0,baston.atacar(cuero));
	}

}
