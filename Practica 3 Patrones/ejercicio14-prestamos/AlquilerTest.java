package ar.edu.unlp.objetos.oo2.ejercicio14_prestamos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlquilerTest {
	private Alquiler al;
	
	@BeforeEach
	void setUp() {
		al = new Alquiler(LocalDate.of(2025, 1, 1),LocalDate.of(2025, 9, 30),500);
	}
	
	@Test
	void testCalcularValor() {
		assertEquals(2000,al.calcularValor());
		assertNotEquals(0,al.calcularValor());
	}
	
	@Test
	void testValorPrendatario() {
		assertEquals(1800,al.valorPrendatario());
		assertNotEquals(0,al.valorPrendatario());
	}
}
