package ar.edu.unlp.objetos.oo2.ejercicio14_prestamos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InmuebleTest {
	private Inmueble in;
	
	@BeforeEach
	void setUp() {
		in = new Inmueble("1 y 50",50,100);
	}
	
	@Test
	void testCalcularValor() {
		assertEquals(5000,in.calcularValor());
		assertNotEquals(0,in.calcularValor());
	}
	
	@Test
	void testValorPrendatario() {
		assertEquals(1000,in.valorPrendatario()) ;
		assertNotEquals(0,in.valorPrendatario());
	}

}
