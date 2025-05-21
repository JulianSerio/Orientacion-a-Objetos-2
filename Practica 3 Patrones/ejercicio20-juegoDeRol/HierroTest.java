package ar.edu.unlp.objetos.oo2.ejercicio20_juegoDeRol;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HierroTest {
	private Hierro hierro;
	private Arma espada,baston,arco;
	
	@BeforeEach
	void setUp() {
		espada = new Espada();
		baston = new Baston();
		arco = new Arco();
		hierro = new Hierro();
	}
	
	@Test
	void testEspada() {
		assertEquals(5,hierro.recibirDaño(espada));
		assertNotEquals(0,hierro.recibirDaño(espada));
	}
	
	@Test
	void testArco() {
		assertEquals(3,hierro.recibirDaño(arco));
		assertNotEquals(0,hierro.recibirDaño(arco));
	}
	
	@Test
	void testBaston() {
		assertEquals(1,hierro.recibirDaño(baston));
		assertNotEquals(0,hierro.recibirDaño(baston));
	}
}
