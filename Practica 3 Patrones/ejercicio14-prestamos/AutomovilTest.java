package ar.edu.unlp.objetos.oo2.ejercicio14_prestamos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AutomovilTest {
	private Automovil au;
	
	@BeforeEach
	void setUp() {
		au = new Automovil("Ford KA",5000,20,1);
	}
	
	@Test
	void testCalcularValor() {
		assertEquals(18,au.calcularValor());
		assertNotEquals(0,au.calcularValor());
	}
	
	@Test
	void testValorPrendatario() {
		assertEquals(12.6,au.valorPrendatario());
		assertNotEquals(0,au.valorPrendatario());
	}
}
