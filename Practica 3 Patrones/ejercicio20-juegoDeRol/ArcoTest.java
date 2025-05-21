package ar.edu.unlp.objetos.oo2.ejercicio20_juegoDeRol;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArcoTest {
	private Arco arco;
	private Armadura acero,cuero,hierro;
	
	@BeforeEach
	void setUp() {
		arco = new Arco();
		acero = new Acero();
		cuero = new Cuero();
		hierro = new Hierro();
	}
	
	@Test
	void testAcero() {
		assertEquals(2,arco.atacar(acero));
		assertNotEquals(0,arco.atacar(acero));
	}
	
	@Test
	void testHierro() {
		assertEquals(3,arco.atacar(hierro));
		assertNotEquals(0,arco.atacar(hierro));
	}
	
	@Test
	void testCuero() {
		assertEquals(5,arco.atacar(cuero));
		assertNotEquals(0,arco.atacar(cuero));
	}
}
