package ar.edu.unlp.objetos.oo2.ejercicio20_juegoDeRol;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AceroTest {
	private Acero acero;
	private Arma espada,baston,arco;
	
	@BeforeEach
	void setUp() {
		espada = new Espada();
		baston = new Baston();
		arco = new Arco();
		acero = new Acero();
	}
	
	@Test
	void testEspada() {
		assertEquals(3,acero.recibirDaño(espada));
		assertNotEquals(0,acero.recibirDaño(espada));
	}
	
	@Test
	void testArco() {
		assertEquals(2,acero.recibirDaño(arco));
		assertNotEquals(0,acero.recibirDaño(arco));
	}
	
	@Test
	void testBaston() {
		assertEquals(1,acero.recibirDaño(baston));
		assertNotEquals(0,acero.recibirDaño(baston));
	}
}
