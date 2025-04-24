package ar.edu.unlp.objetos.oo2.Practica2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicio2.Planta;

public class PlantaTest {
	private Planta planta,plantaNoCasado,plantaSinNada;

	@BeforeEach
	public void setUp() {
		planta = new Planta(100,true,2,10);
		plantaNoCasado = new Planta(100,false,2,10);
		plantaSinNada = new Planta(100,false,0,0);
		
	}
	
	@Test
	public void testSueldo() {
		assertEquals(27637, planta.sueldo());       
		assertEquals(22887, plantaNoCasado.sueldo());
		assertEquals(87,plantaSinNada.sueldo());
	}

}
