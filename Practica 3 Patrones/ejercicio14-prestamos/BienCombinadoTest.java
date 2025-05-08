package ar.edu.unlp.objetos.oo2.ejercicio14_prestamos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BienCombinadoTest {
	private Alquiler alquiler;
	private Automovil auto;
	private BienCombinado bien;
	
	@BeforeEach
	void setUp() {
		auto = new Automovil("Ford KA",5000,20,1);
		alquiler = new Alquiler(LocalDate.of(2025, 1, 1),LocalDate.of(2025, 9, 30),500);
		List<Bien> bienes = new ArrayList<Bien>();
		bienes.add(auto);bienes.add(alquiler);
		bien = new BienCombinado(bienes);
	}
	
	@Test
	void testCalcularValor() {
		assertEquals(2018,bien.calcularValor());
		assertNotEquals(0,bien.calcularValor());
	}
	
	@Test
	void testValorPrendatario() {
		assertEquals(1009,bien.valorPrendatario());
		assertNotEquals(0,bien.valorPrendatario());
	}	

}
