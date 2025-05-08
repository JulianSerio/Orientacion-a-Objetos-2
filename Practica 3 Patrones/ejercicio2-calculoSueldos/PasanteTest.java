package ar.edu.unlp.objetos.oo2.Practica2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicio2.Pasante;

public class PasanteTest {
	private Pasante pasante;
	private Pasante pasanteSinExamenes;

	@BeforeEach
	public void setUp() {
		pasante = new Pasante(100,5);
		pasanteSinExamenes = new Pasante(100,0);
	}
	
	@Test
	public void testSueldo() {
		assertEquals(9587,pasante.sueldo());
		assertEquals(87,pasanteSinExamenes.sueldo());
	}
}
