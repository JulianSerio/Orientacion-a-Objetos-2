package ar.edu.unlp.objetos.oo2.ejercicio20_juegoDeRol;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CueroTest {
	private Cuero cuero;
	private Arma espada,baston,arco;
	
	@BeforeEach
	void setUp() {
		espada = new Espada();
		baston = new Baston();
		arco = new Arco();
		cuero = new Cuero();
	}
	
	@Test
	void testEspada() {
		assertEquals(8,cuero.recibirDaño(espada));
		assertNotEquals(0,cuero.recibirDaño(espada));
	}
	
	@Test
	void testArco() {
		assertEquals(5,cuero.recibirDaño(arco));
		assertNotEquals(0,cuero.recibirDaño(arco));
	}
	
	@Test
	void testBaston() {
		assertEquals(2,cuero.recibirDaño(baston));
		assertNotEquals(0,cuero.recibirDaño(baston));
	}

}
